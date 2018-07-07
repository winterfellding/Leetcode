package me.winterfall.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/28/
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        List<Integer> noneZeroIdx = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                noneZeroIdx.add(i);
            }
        }

        int aryIdx = 0;
        for (int idx : noneZeroIdx) {
            nums[aryIdx++] = nums[idx];
        }
        for (int i = aryIdx; i < nums.length; i++) {
            nums[i] =  0;
        }
    }
}
