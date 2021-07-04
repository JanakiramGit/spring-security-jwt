package com.jk.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jk.security.model.AuthenticationRequest;

@RestController
public class HelloController {

	@RequestMapping({"/hello"})
	public String hello() {
		return "Helloo....";
	}
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthentictionToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
