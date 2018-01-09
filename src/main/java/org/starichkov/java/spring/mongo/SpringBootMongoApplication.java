package org.starichkov.java.spring.mongo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMongoApplication implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootMongoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoApplication.class, args);
    }

    private SampleService sampleService;

    @Autowired
    public void setSampleService(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info(sampleService.getDbName());

        Sample sample = new Sample(1L, "Sample #1");
        sampleService.save(sample);

        LOGGER.info(sample.toString());

        Sample sample1 = sampleService.get(1);
        LOGGER.info(sample1.toString());
    }
}
