package com.labseq.integration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.util.StopWatch;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class LabseqIntegrationTest {
    
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetLabseqValuePerformance() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i <= 10000; i++) {
            restTemplate.getForObject("/labseq/" + i, Object.class);
        }
        stopWatch.stop();
        long executionTime = stopWatch.getLastTaskTimeMillis();
        System.out.println(executionTime);
        assertTrue(executionTime < 10000, "Execution time should be less than 10 seconds");
    }
}
