package com.jq.jqbbm_server.Server.Security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.jq.jqbbm_server.Config.AppConfig;
import com.jq.jqbbm_server.Dao.Secondary.JwtValidRepo;
import com.jq.jqbbm_server.Entity.Secondary.JwtToken;
import com.jq.jqbbm_server.Server.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

/**
 * @author Tammy
 * @date 2025-3-24 01:06:33
 * JWT鉴权
 */

@Service
@RequiredArgsConstructor
public class AuthJwt implements AuthService {

    private final AppConfig appConfig;

    private final JwtValidRepo jwtValidRepo;

    @Override
    public String createToken(String username) {
        Algorithm algorithm = Algorithm.HMAC256(appConfig.getJwtSecret());
        return JWT.create()
                .withIssuer(appConfig.getJwtIssuer())
                .withClaim("username", username)
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 7))
                .sign(algorithm);
    }

    @Override
    public boolean verifyToken(String token) {
        return !Objects.isNull(getDecodeToken(token));
    }

    @Override
    public String getUsername(String token) {
        DecodedJWT decodeToken = (DecodedJWT) getDecodeToken(token);
        if (Objects.isNull(decodeToken)) return null;
        return decodeToken.getClaim("username").asString();
    }

    @Override
    public Object getDecodeToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(appConfig.getJwtSecret());
            return JWT.require(algorithm).build().verify(token);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean isTokenValid(String token) {
        return !jwtValidRepo.existsByToken(token);
    }

    @Override
    public void removeTokenFromDb(String token) {
        jwtValidRepo.deleteByToken(token);
    }

    @Override
    public void saveTokenToDb(String token) {
        JwtToken jwtToken = new JwtToken()
                .setToken(token)
                .setCreateTime(LocalDateTime.now());
        jwtValidRepo.save(jwtToken);
    }
}
