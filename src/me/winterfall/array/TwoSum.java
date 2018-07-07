package me.winterfall.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/29/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null && map.get(target - nums[i]) != i) {
                return new int[] {i, map.get(target - nums[i])};
            }
        }
        return null;
    }

}
