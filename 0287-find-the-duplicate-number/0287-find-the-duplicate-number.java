class Solution {
    public int findDuplicate(int[] nums) {
        

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int n: nums){
            map.put(n, map.getOrDefault(n , 0)+1);
        }

        for(int i: nums){
            if(map.get(i)>1){
                return i;
            }
        }
        return -1;
    }
}