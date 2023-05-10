//package com.example.hello.jwt;
//
//import com.example.hello.entites.user;
////import org.springframework.security.core.userdetails.User;
//import org.springframework.stereotype.Component;
//import java.util.Date;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
////import io.jsonwebtoken.security.Keys;
//
//import java.security.Key;
//
//@Component
//public class JwtUtility{
//	public static final long EXPIRATION_TIME = 3600000; // 1 hour
//    public static final String SECRET_KEY = "yourSecretKeyWithEnoughLengthToBeSecure";
//    private final String jwtSecret = "licensekey";
//
//	private final long jwtExpirationInMs = 86400000;
//	public String generateJwt(user u) {
//		
//		Date now = new Date();
//		Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);
//		return Jwts.builder().setSubject("chung").setIssuedAt(new Date()).setExpiration(expiryDate)
//				.signWith(SignatureAlgorithm.HS512, jwtSecret).compact();
//	}
//	
//}
