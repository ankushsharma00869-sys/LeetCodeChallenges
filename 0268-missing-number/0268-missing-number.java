class Solution {
    public int missingNumber(int[] nums) {
        int xorSum = 0;
        // phle sare array ke element ke xorSum kr denge 

        for(int n:nums){
            xorSum ^=  n;


        }

                // phir range ke xorSum kr denge 
        for(int i =0; i<=nums.length; i++){
            xorSum ^= i;

        }
        // ans me xorSum return kr denge
        return xorSum;
    }
}