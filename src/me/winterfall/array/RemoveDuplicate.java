package me.winterfall.array;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 */
public class RemoveDuplicate {

    public int removeDuplicates(int[] nums) {
        int idx = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }

}
