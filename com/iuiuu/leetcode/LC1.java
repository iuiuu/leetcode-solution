package com.iuiuu.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class LC1 {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int[] result = new LC1().twoSum(nums, target);

        println(result);

        nums = new int[] { 3, 2, 4 };
        target = 6;
        result = new LC1().twoSum(nums, target);
        println(result);

        nums = new int[] { 3, 3 };
        target = 6;
        result = new LC1().twoSum(nums, target);
        println(result);

        result = new LC1().twoSum_2(nums, target);
        println(result);
        
    }

    public static void println(int[] arr) {
        System.out.println("\r\n\r\n======== Start printing ===");

        if (arr == null) {
            System.out.println("x");
        } else {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("======== End of printing. ===\r\n\r\n");
    }

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    /**
     * 
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];

            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}