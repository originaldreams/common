package com.originaldreams.common;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.junit.Test;

import java.security.Key;

public class JwtTest {

    @Test
    public void generate() {
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        String jws = Jwts.builder().setHeaderParam("userId", 123123).setSubject("use").signWith(key).compact();

        System.out.println(jws);
        assert Jwts.parser().setSigningKey(key).parseClaimsJws(jws).getBody().getSubject().equals("use");
    }
}
