package com.sukanya.asu.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class LC_Problem1 {

    //Two Sum problem - Two numbers in an array sum up to a specific target; returns the indices
    private int[] getTwoSum(int[] inputArray, int target) {
        int[] result = {-1, -1};
        HashMap<Integer, Integer> p = new HashMap<>();
        int arrayLen = inputArray.length;
        for (int i = 0; i < arrayLen; i++) {
            int currElement = inputArray[i];
            int diff = target - currElement;
            boolean b = p.containsKey(diff);
            if (b) {
                result[0] = p.get(diff);
                result[1] = i;
                return result;

            } else {
                p.put(currElement, i);
            }

        }
        return result;
    }

    public static void main(String[] args) {

        int[] input = {2, 17, 11, 15, 7};
        int[] output = new LC_Problem1().getTwoSum(input, 9);
        System.out.println(Arrays.toString(output));

    }
}
