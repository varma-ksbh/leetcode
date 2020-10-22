package com.varma.leet.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
    final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void testIsPalindrome() {
        assertEquals(true, palindromeNumber.isPalindrome(121));
        assertEquals(false, palindromeNumber.isPalindrome(-121));
        assertEquals(false, palindromeNumber.isPalindrome(-101));
        assertEquals(true, palindromeNumber.isPalindrome(11));
    }
}
