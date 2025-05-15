package com.lucas.tennis.service;

import com.lucas.tennis.ApplicationStatus;
import com.lucas.tennis.HealthCheck;
import com.lucas.tennis.repository.HealthCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    @Autowired
    private HealthCheckRepository healthCheckRepository;

    public HealthCheck healthCheck() {
        Long activeSessions = healthCheckRepository.countApplicationConnections();

        if (activeSessions > 0) {
            return new HealthCheck(ApplicationStatus.OK, "OK");
        }
        return new HealthCheck(ApplicationStatus.KO, "KO");
    }
}
