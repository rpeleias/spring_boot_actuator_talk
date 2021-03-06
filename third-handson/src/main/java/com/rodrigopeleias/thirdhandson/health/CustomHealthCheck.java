package com.rodrigopeleias.thirdhandson.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthCheck implements HealthIndicator {


    @Override
    public Health health() {
        int errorCode = check();
        if (errorCode != 0) {
            return Health.down().withDetail("errorCode", errorCode).build();
        }
        return Health.up().build();
    }

    public int check() {
        return 1;
    }
}
