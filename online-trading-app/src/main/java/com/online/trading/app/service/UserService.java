package com.online.trading.app.service;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.online.trading.app.payload.LoginDto;
import com.online.trading.app.payload.ResponseData;
import com.online.trading.app.payload.SignUpDto;

public interface UserService {

	ResponseEntity<?> registerUser(SignUpDto signUpDto);

	ResponseEntity<?> loginUser(@Valid LoginDto loginDto);

}
