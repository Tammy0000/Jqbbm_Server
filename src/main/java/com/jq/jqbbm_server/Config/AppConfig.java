package com.jq.jqbbm_server.Config;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppConfig {

    private final Environment env;

    public String getPrimaryUrl() {
        return env.getProperty("spring.datasource.primary.url");
    }

    public String getSecondaryUrl() {
        return env.getProperty("spring.datasource.secondary.url");
    }

    public String getPrimaryUser() {
        return env.getProperty("spring.datasource.primary.username");
    }

    public String getSecondaryUser() {
        return env.getProperty("spring.datasource.secondary.username");
    }

    public String getPrimaryPassword() {
        return env.getProperty("spring.datasource.primary.password");
    }

    public String getSecondaryPassword() {
        return env.getProperty("spring.datasource.secondary.password");
    }

    public String getPrimaryClassName() {
        return env.getProperty("spring.datasource.primary.driver-class-name");
    }

    public String getSecondaryClassName() {
        return env.getProperty("spring.datasource.secondary.driver-class-name");
    }

    public String getJwtSecret() {
        return env.getProperty("Jwt.secret");
    }

    public String getJwtExpiration() {
        return env.getProperty("Jwt.expire");
    }

    public String getJwtIssuer() {
        return env.getProperty("Jwt.issuer");
    }
}
