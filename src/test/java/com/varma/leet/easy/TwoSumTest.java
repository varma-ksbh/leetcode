package com.varma.leet.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {
    final TwoSum twoSum = new TwoSum();
    final int[] input1 = new int[]{2, 7, 11, 15}; 

    @Test
    public void twoSumTest() {
        assertArrayEquals(twoSum.twoSum(input1, 9), new int[]{0, 1});
    }
}
