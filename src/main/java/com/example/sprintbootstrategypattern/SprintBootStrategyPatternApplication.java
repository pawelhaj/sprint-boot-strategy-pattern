package com.example.sprintbootstrategypattern;

import com.example.sprintbootstrategypattern.service.DevicesParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprintBootStrategyPatternApplication implements CommandLineRunner {

    @Autowired
    private DevicesParserService devicesParserService;

    public static void main(String[] args) {
        SpringApplication.run(SprintBootStrategyPatternApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        devicesParserService.parseAll();
    }
}
