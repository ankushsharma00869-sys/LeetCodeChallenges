class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int ans = nums[0] + nums[1]+nums[2];

        for(int i =0; i<nums.length-2; i++){

            if(i >0 && nums[i] == nums[i-1])
                continue;
            int left =i+1;
            int r = nums.length -1;

            while(left < r){
                int sum = nums[i]+nums[left]+nums[r];

                if(Math.abs(sum - target) < Math.abs(ans - target)){
                    ans = sum;
                }

                if(sum < target){
                    left++;
                } else if(sum>target){
                    r--;
                }
                else{
                    return sum;
                }
            }

        }
        return ans;


    }
}