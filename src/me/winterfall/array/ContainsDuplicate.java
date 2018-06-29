package me.winterfall.array;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/24/
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }

}
