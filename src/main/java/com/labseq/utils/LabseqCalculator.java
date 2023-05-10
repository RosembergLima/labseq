package com.labseq.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * The class contains several static methods used to calculate Labseq values for
 * given input values. The Labseq value of an input value 'n' is calculated
 * based on the rules of the Labseq sequence.
 * 
 * The class uses a cache to store previously calculated Labseq values, to avoid
 * calculating the same values repeatedly.
 * 
 * The class also throws an IllegalArgumentException if the input value is null
 * or negative.
 * 
 * Each method has its own Javadoc, explaining its purpose and usage.
 */
public class LabseqCalculator {

    private static Map<Integer, Integer> cache = new HashMap<>();

    /**
     * 
     * This method calculates the labseq value for a given input 'n'.
     * 
     * @param n The input value for which the labseq value needs to be calculated.
     * 
     * @return The labseq value for the given input 'n'.
     * 
     * @throws IllegalArgumentException If the input value is null or negative.
     */
    public static int getLabseqValue(Integer n) {

        if (repeatedValue(n))
            return cache.get(n);

        if (n < 4)
            return calculateLessThan4(n);
        return calculateGreaterOrEqualThan4(n);
    }

    /**
     * 
     * Calculates the value of the Labseq sequence for the given input n,
     * 
     * which should be greater or equal to 4.
     * 
     * @param n the input value to calculate the Labseq sequence for, should be
     *          greater or equal to 4
     * 
     * @return the value of the Labseq sequence for the given input n
     * 
     * @throws IllegalArgumentException if the input n is null or negative
     */
    private static int calculateGreaterOrEqualThan4(Integer n) {
        Integer valueWith4 = n;
        Integer valueWith3 = n;
        Integer result = null;

        if (repeatedValue(n - 4))
            valueWith4 = cache.get(n - 4);
        if (repeatedValue(n - 3))
            valueWith3 = cache.get(n - 3);

        result = valueWith4 + valueWith3;
        addCache(n, result);
        return result;
    }

    /**
     * 
     * Calculates the Labseq value for a number n that is less than 4.
     * 
     * @param n an Integer representing the number to calculate the Labseq value.
     * 
     * @return an Integer representing the calculated Labseq value.
     */
    private static Integer calculateLessThan4(Integer n) {
        Integer value = null;

        switch (n) {
            case 0:
                value = Constants.LABSEQ_ZERO_VALUE;
                break;
            case 1:
                value = Constants.LABSEQ_ONE_VALUE;
                break;
            case 2:
                value = Constants.LABSEQ_ZERO_VALUE;
                break;
            case 3:
                value = Constants.LABSEQ_ONE_VALUE;
                break;
            default:
                break;
        }

        addCache(n, value);
        return value;
    }

    /**
     * 
     * Checks if the given value is already present in the cache.
     * 
     * @param n the value to be checked
     * @return true if the value is already in the cache, false otherwise
     */
    private static boolean repeatedValue(Integer n) {
        return cache.containsKey(n);
    }

    /**
     * 
     * Adds a new entry to the cache, mapping the input parameter n to the given
     * value,
     * but only if n is not already a key in the cache.
     * 
     * @param n     the integer input parameter to be mapped to the given value in
     *              the cache
     * @param value the integer value to be cached
     */
    private static void addCache(int n, Integer value) {
        if (!repeatedValue(n))
            cache.put(n, value);
    }

}
