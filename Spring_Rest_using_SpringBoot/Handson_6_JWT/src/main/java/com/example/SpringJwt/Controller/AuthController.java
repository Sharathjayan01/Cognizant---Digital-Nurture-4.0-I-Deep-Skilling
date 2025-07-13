package com.example.SpringJwt.Controller;

import java.security.Principal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJwt.Service.JwtService;

@RestController
public class AuthController {
	private final JwtService jwtService;
	public AuthController(JwtService jwtService) {
		this.jwtService=jwtService;
	}
	
	@GetMapping("/authenticate")
	public ResponseEntity<?> authenticate(Principal principal){
		String username=principal.getName();
		String token=jwtService.generateToken(username);
		return ResponseEntity.ok().body("{\"token\":\""+token+"\"}");
	}
}
