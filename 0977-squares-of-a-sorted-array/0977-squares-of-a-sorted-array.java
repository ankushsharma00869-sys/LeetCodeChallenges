class Solution {
    public int[] sortedSquares(int[] nums) {

       int left =0;
        int right = nums.length - 1;
       int [] ans  = new int [ nums.length];
       int k =  nums.length -1;

       while(left<=right){
        int leftSqaure = nums[left] * nums[left];
        int rightSqaure = nums[right] * nums[right];

        if(leftSqaure > rightSqaure ){
            ans[k] = leftSqaure;
            left++;
        }
        else{
            ans[k] = rightSqaure;
            right--;
        }
        k--;


       }

       return ans;


        
    }
}