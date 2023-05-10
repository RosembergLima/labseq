package com.labseq.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class LabseqServiceTests {
    
    private LabseqService labseqService;
    
    @BeforeEach
    public void setUp() {
        labseqService = new LabseqService();
        // adicionar valores iniciais no cache
        labseqService.getLabseqValue(0);
        labseqService.getLabseqValue(1);
        labseqService.getLabseqValue(2);
        labseqService.getLabseqValue(3);
        labseqService.getLabseqValue(4);
        labseqService.getLabseqValue(5);
    }
    @Test
    void testGetLabseqValueWithValidInput() {
        LabseqService labseqService = new LabseqService();
        int result = labseqService.getLabseqValue(6);
        assertEquals(1, result);
    }
    
    @Test
    void testGetLabseqValueWithNegativeInput() {
        LabseqService labseqService = new LabseqService();
        assertThrows(IllegalArgumentException.class, () -> {
            labseqService.getLabseqValue(-1);
        });
    }
    
    @Test
    void testGetLabseqValueWithZeroInput() {
        LabseqService labseqService = new LabseqService();
        int result = labseqService.getLabseqValue(0);
        assertEquals(0, result);
    }
    
    @Test
    void testGetLabseqValueWithOneInput() {
        LabseqService labseqService = new LabseqService();
        int result = labseqService.getLabseqValue(1);
        assertEquals(1, result);
    }
    
    @Test
    void testGetLabseqValueWithTwoInput() {
        LabseqService labseqService = new LabseqService();
        int result = labseqService.getLabseqValue(2);
        assertEquals(0, result);
    }
    
    @Test
    void testGetLabseqValueWithThreeInput() {
        LabseqService labseqService = new LabseqService();
        int result = labseqService.getLabseqValue(3);
        assertEquals(1, result);
    }
}

