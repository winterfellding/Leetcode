package me.winterfall.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/26/
 */
public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 > len2) {
            return intersectLongShort(nums1, nums2);
        } else {
            return intersectLongShort(nums2, nums1);
        }
    }

    public int[]  intersectLongShort(int[] longNums, int[] shortNums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : longNums) {
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int num : shortNums) {
            if (map.get(num) != null && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] aryResult = new int[result.size()];
        int idx = 0;
        for (Integer num : result) {
            aryResult[idx++] = num;
        }
        return aryResult;
    }

}
