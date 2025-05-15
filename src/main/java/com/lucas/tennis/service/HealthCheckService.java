package com.lucas.tennis.service;

import com.lucas.tennis.ApplicationStatus;
import com.lucas.tennis.HealthCheck;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {
    public HealthCheck healthCheck() {
        return new HealthCheck(ApplicationStatus.OK, "OK");
    }
}
