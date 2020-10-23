package com.varma.leet.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    final static Map<Character, Integer> romanValueMap = new HashMap<>();
    final static Map<Character, Character> romanSubtractMap = new HashMap<>();
    static {
        romanValueMap.put('I', 1);
        romanValueMap.put('V', 5);
        romanValueMap.put('X', 10);
        romanValueMap.put('L', 50);
        romanValueMap.put('C', 100);
        romanValueMap.put('D', 500);
        romanValueMap.put('M', 1000);

        romanSubtractMap.put('V', 'I');
        romanSubtractMap.put('X', 'I');
        romanSubtractMap.put('L', 'X');
        romanSubtractMap.put('C', 'X');
        romanSubtractMap.put('D', 'C');
        romanSubtractMap.put('M', 'C');
    }

    public int romanToInt(String s) {
        int totalValue = 0;
        Character previousRomanChar = '-';

        for (Character romanChar: s.toCharArray()) {
            int value = 0;
            if (romanSubtractMap.containsKey(romanChar) && previousRomanChar.equals(romanSubtractMap.get(romanChar))) {
                value = romanValueMap.get(romanChar) - 2 * romanValueMap.get(previousRomanChar);
            } else {
                value = romanValueMap.get(romanChar);
            }
            totalValue += value;
            previousRomanChar = romanChar;
        }
        return totalValue;
    }
}
