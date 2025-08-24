package com.example.SpringJwt.Service;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class JwtService {
	private static final String SECRET = "1234567890abcdefghijklmnopqrstuvwxyz1234"; // 40+ chars

    private final Key key = Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));
	public String generateToken(String username) {
		long now=System.currentTimeMillis();
		long expiration=now+10000*60*100;
		return Jwts.builder()
				.setSubject(username)
				.setIssuedAt(new Date(now))
				.setExpiration(new Date(expiration))
				.signWith(key,SignatureAlgorithm.HS256)
				.compact();
	}
}
