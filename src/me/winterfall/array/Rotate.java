package me.winterfall.array;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/
 */
public class Rotate {

    public void rotate(int[] nums, int k) {
        if (nums.length < k) {
            k = k % nums.length;
        }
        int[] temp = new int[k];
        int idx = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            temp[idx++] = nums[i];
        }
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i-k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

}
