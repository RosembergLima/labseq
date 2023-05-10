package com.labseq.services;

import org.springframework.stereotype.Service;

import com.labseq.utils.Constants;
import com.labseq.utils.LabseqCalculator;

@Service
public class LabseqService {

    /**
     * 
     * Returns the labseq value for the given positive integer value.
     * 
     * @param n a non-negative integer value
     * @return the labseq value of the given integer
     * @throws IllegalArgumentException if the given value is null or negative
     */
    public Integer getLabseqValue(Integer n) throws IllegalArgumentException {
        if (n == null || n < 0) {
            throw new IllegalArgumentException(Constants.ERROR_MESSAGE_NON_NEGATIVE_INTEGER);
        }
        return LabseqCalculator.getLabseqValue(n);
    }
}
