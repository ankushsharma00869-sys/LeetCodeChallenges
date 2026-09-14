import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int i = 0;
        int j = 0;

        long sum = 0;
        long max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while (j < nums.length) {

            // Add current element
            sum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            // Window size < k
            if (j - i + 1 < k) {
                j++;
            }

            // Window size == k
            else {

                // All elements are distinct
                if (map.size() == k) {
                    max = Math.max(max, sum);
                }

                // Remove nums[i]
                sum -= nums[i];

                map.put(nums[i], map.get(nums[i]) - 1);

                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }

                i++;
                j++;
            }
        }

        return max;
    }
}