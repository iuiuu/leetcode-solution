package com.iuiuu.leetcode;
import java.util.Arrays;

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

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}