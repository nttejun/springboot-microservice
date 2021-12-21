package com.springboot.microservice.service;

import org.springframework.stereotype.Service;

@Service
public interface RandomGeneratorService {
  int generateRandomFactor();
}
