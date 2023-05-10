package com.labseq.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class LabseqCalculatorTests {

    @Test
    public void testGetLabseqValueWithValidInput() {
        assertEquals(0, LabseqCalculator.getLabseqValue(0));
        assertEquals(1, LabseqCalculator.getLabseqValue(1));
        assertEquals(0, LabseqCalculator.getLabseqValue(2));
        assertEquals(1, LabseqCalculator.getLabseqValue(3));
        assertEquals(1, LabseqCalculator.getLabseqValue(4));
        assertEquals(1, LabseqCalculator.getLabseqValue(5));
        assertEquals(1, LabseqCalculator.getLabseqValue(6));
        assertEquals(2, LabseqCalculator.getLabseqValue(7));
        assertEquals(2, LabseqCalculator.getLabseqValue(8));
        assertEquals(2, LabseqCalculator.getLabseqValue(9));
        assertEquals(3, LabseqCalculator.getLabseqValue(10));
    }

    @Test
    public void testGetLabseqValueWithZeroInput() {
        assertEquals(0, LabseqCalculator.getLabseqValue(0));
    }

}
