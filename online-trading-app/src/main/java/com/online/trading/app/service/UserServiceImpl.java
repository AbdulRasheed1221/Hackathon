package com.online.trading.app.service;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.online.trading.app.entity.User;

import com.online.trading.app.payload.LoginDto;
import com.online.trading.app.payload.ResponseData;
import com.online.trading.app.payload.SignUpDto;
import com.online.trading.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public ResponseEntity<?> registerUser(SignUpDto signUpDto) {

		ResponseData response = new ResponseData();
		// add check for email exists in DB
		if (userRepository.existsByEmail(signUpDto.getEmail_id())) {
			return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
		}

		// create user object
		User user = new User();
		user.setUsername(signUpDto.getUser_name());
		user.setEmail(signUpDto.getEmail_id());
		user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
		user.setId_document_name(signUpDto.getId_document_name());
		user.setId_document_number(signUpDto.getId_document_number());
		user.setPan_number(signUpDto.getPan_number());
		user.setPhone_number(signUpDto.getPhone_number());
		LocalDate localDate = LocalDate.now();
		user.setCreate_date(localDate);
		userRepository.save(user);
		response.setUsername(user.getUsername());
		response.setPassword(passwordEncoder.encode(user.getPassword()));
		return new ResponseEntity<ResponseData>(response, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<?> loginUser(@Valid LoginDto loginDto) {
		if (userRepository.existsByEmail(loginDto.getEmail())) {
			return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Email is not registered!", HttpStatus.BAD_REQUEST);
		}
	}
}
