package com.varma.leet.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {
    final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void testReverseInteger() {
        assertEquals(-321, reverseInteger.reverse(-123));
        assertEquals(321, reverseInteger.reverse(123));
        assertEquals(0, reverseInteger.reverse(0));
        assertEquals(21, reverseInteger.reverse(120));
    }
}
