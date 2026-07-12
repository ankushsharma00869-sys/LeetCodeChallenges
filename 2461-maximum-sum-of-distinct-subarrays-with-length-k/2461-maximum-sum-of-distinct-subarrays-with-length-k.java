import java.util.HashMap;

class Solution {

    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        long sum = 0;
        long max = 0;

        for (int j = 0; j < nums.length; j++) {

            // Add current element into window
            sum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            // If window size becomes greater than k
            if (j - i + 1 > k) {

                // Remove left element from sum
                sum -= nums[i];

                // Decrease its frequency
                map.put(nums[i], map.get(nums[i]) - 1);

                // Remove key if frequency becomes 0
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }

                // Move left pointer
                i++;
            }

            // Check when window size is exactly k
            if (j - i + 1 == k) {

                // All elements must be distinct
                if (map.size() == k) {
                    max = Math.max(max, sum);
                }
            }
        }

        return max;
    }
}