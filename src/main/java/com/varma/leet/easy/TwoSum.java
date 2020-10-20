package com.varma.leet.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    final Map<Integer, Integer> indexMap = new HashMap<>();

    public int[] twoSum(final int[] nums, final int target) {
        for (int i = 0; i < nums.length; i++) {
            if(indexMap.containsKey(target - nums[i])) {
                return new int[]{ indexMap.get(target - nums[i]), i };
            } else {
                indexMap.put(nums[i], i);
            }
        }
        return new int[] { -1, -1};
    }
}
