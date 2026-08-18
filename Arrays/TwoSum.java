import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                output[0] = map.get(complement);
                output[1] = i;
                return output;
            }
            map.put(nums[i], i);
        }
        return output;
    }
}

/*
Problem: Two Sum

Platform: LeetCode

Approach:
1. Calculate the complement.
2. Check whether the complement exists in the HashMap.
3. If found, return both indices.
4. Otherwise, store the current element.

Time Complexity: O(n)

Space Complexity: O(n)
*/
