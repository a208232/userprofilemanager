package com.project.UserProfileManager.repository;

import com.project.UserProfileManager.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository {

	Mono<User> findById(Integer id);

	Flux<User> findAll();
}
