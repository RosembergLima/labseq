package com.labseq.config;

import java.util.stream.IntStream;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.labseq.utils.LabseqCalculator;

@Component
public class DataLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {  
        IntStream.range(0, 10001).forEach(LabseqCalculator::getLabseqValue);
    }
}
