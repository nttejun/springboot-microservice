package com.springboot.microservice.service;

import static org.mockito.BDDMockito.given;

import com.springboot.microservice.domain.Multiplication;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

public class MultiplicationServiceTest {

  @MockBean
  private RandomGeneratorService randomGeneratorService;

  @Autowired
  private MultiplicationService multiplicationService;

  @Test
  public void createRandomMultiplicationTest() {
    given(randomGeneratorService.generateRandomFactor()).willReturn(50, 30);

    Multiplication multiplication = multiplicationService.createRandomMultiplication();

    Assertions.assertThat(multiplication.getFactorA()).isEqualTo(50);
    Assertions.assertThat(multiplication.getFactorB()).isEqualTo(30);
    Assertions.assertThat(multiplication.getResult()).isEqualTo(1500);
  }
}