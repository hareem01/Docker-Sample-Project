package com.example.testApp;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Scanner;

@EnableAutoConfiguration
@SpringBootApplication
public class TestAppApplication {


	public static void main(String[] args) {


		SpringApplication.run(TestAppApplication .class,args);

}

}