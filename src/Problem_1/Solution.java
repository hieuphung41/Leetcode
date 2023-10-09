package Problem_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

// ===== 1. Brute Force =====

        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j]==target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};

// ===== 2. Two-pass Hash Table =====

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            numMap.put(nums[i], i);
        }
        for (int i=0; i<nums.length; i++) {
            int tmp = target - nums[i];
            if (numMap.containsKey(tmp) && numMap.get(tmp)!=i) {
                return new int[]{i, numMap.get(tmp)};
            }
        }
        return new int[]{};

// ===== 3. One-pass Hash Table =====

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int tmp = target-nums[i];
            if (numMap.containsKey(tmp)) {
                return new int[]{numMap.get(tmp), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};

    }

}
