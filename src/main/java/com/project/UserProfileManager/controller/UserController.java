package com.project.UserProfileManager.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.UserProfileManager.model.User;
import com.project.UserProfileManager.repository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class UserController {

	private final UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping(value = "/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<ResponseEntity<User>> findUserById(@PathVariable Integer id) {
		return userRepository.findById(id).map(user -> ResponseEntity.ok(user))
				.defaultIfEmpty(ResponseEntity.notFound().build());
	}

	@GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<User> findAllUsers() {
		return userRepository.findAll();
	}
}
