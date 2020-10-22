package com.varma.leet.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverse = 0;
        int originalX = x;
        while (x != 0) {
            reverse =  reverse * 10 + x % 10;
            x = x / 10;
        }
        return originalX == reverse;
    } 
}
