package com.project.UserProfileManager.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import com.project.UserProfileManager.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class UserRepositoryImpl implements UserRepository {

	private final Map<Integer, User> users;

	public UserRepositoryImpl() {
		users = new HashMap<Integer, User>();
		users.put(101, new User(101, "Tom", "Hank", "tom@users.org"));
		users.put(102, new User(102, "Bob", "Lynx", "bob@users.org"));
		users.put(103, new User(103, "Misha", "Je", "misha@users.org"));
	}

	@Override
	public Mono<User> findById(Integer id) {
		return Mono.justOrEmpty(users.get(id));
	}

	@Override
	public Flux<User> findAll() {
		return Flux.fromIterable(users.values());
	}

}