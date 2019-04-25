package com.potulad.leetcode.solutions;

import java.util.HashMap;

/**
 * Submitted date: 2019-04-25.
 * Runtime - 99.51%
 * Space - 68.01%
 */
class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> arrayAndIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            // This shouldn't work if there is more than one solution to a problem,
            // but since the question says that there can be just one solution,
            // the duplicates can never be part of the solution, since it will
            // lead to more than one solution.

            // If the duplicates lead to a solution, then they are the only possible solution
            // E.g. [3,3] and target of 6.
            if (arrayAndIndex.containsKey(nums[i])) {
                if (nums[i] + nums[i] == target) {
                    int[] solution = {arrayAndIndex.get(nums[i]), i};
                    return solution;
                }
            }

            if (arrayAndIndex.containsKey(target - nums[i])) {
                int[] solution = {arrayAndIndex.get(target - nums[i]), i};
                return solution;
            }

            arrayAndIndex.put(nums[i], i);

        }
        return new int[0];
    }
}