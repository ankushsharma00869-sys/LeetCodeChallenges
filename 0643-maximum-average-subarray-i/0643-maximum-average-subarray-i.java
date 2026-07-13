class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i =0;
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int j = 0; j<nums.length; j++){
            sum += nums[j];
           
            if(j-i+1 == k){
                maxSum = Math.max(maxSum, sum);
                sum -= nums[i];
                i++;
            }
        }
        return (double) maxSum / k;
    }
}