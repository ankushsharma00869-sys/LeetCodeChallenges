class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int ans = nums[0];

        for(int i = 1; i<nums.length; i++){
            int v1 = sum + nums[i];
            int v2 = nums[i];
            int max = Math.max(v1 , v2);
             sum = max;  
             ans = Math.max(ans , max);
        }
        return ans;
    }
}