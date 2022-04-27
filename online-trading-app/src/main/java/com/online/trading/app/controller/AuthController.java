package com.online.trading.app.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.time.LocalDate;
import java.util.List;
import java.util.TimeZone;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.trading.app.constant.Status;
import com.online.trading.app.entity.User;
import com.online.trading.app.payload.LoginDto;
import com.online.trading.app.payload.SignUpDto;
import com.online.trading.app.repository.UserRepository;
import com.online.trading.app.service.UserService;

@Api(value = "Auth controller exposes siginin and signup REST APIs")
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
	
	private Logger logger = LoggerFactory.getLogger(AuthController.class);

	@Autowired
	private UserService userService;

	@ApiOperation(value = "REST API to Signin or Login user to trading app")
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@Valid @RequestBody LoginDto loginDto) {
		ResponseEntity<?> customerDto = null;
		logger.debug("Invoke login service");
		customerDto = userService.loginUser(loginDto);
		return customerDto;
	}

	@ApiOperation(value = "REST API to Register or Signup user to trading app")
	@PostMapping("/registration")
	public ResponseEntity<?> registerUser(@RequestBody SignUpDto signUpDto) {
		ResponseEntity<?> customerResponseDto = null;
		logger.debug("Invoke registerUser service");
		customerResponseDto = userService.registerUser(signUpDto);
		return customerResponseDto;
	}

}
