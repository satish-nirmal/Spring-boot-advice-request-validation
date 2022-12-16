package com.example.exception.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.dto.UserRequest;
import com.example.exception.entity.User;
import com.example.exception.exception.UserNotFoundException;
import com.example.exception.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User saveUser(UserRequest userRequest) {
		User user = User.build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
				userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {

		return userRepository.findAll();
	}

	public Optional<User> getUser(Integer id) throws UserNotFoundException {

		Optional<User> user = userRepository.findById(id);

		if (user != null) {

			return user;
		} else {
			throw new UserNotFoundException();
		}
	}
}
