
class Solution {
    public int maximumSum(int[] arr) {

        int keep = arr[0];
        int delete = Integer.MIN_VALUE;

        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int x = arr[i];

            int oldKeep = keep;

            keep = Math.max(x, oldKeep + x);

            int newDelete = oldKeep;

            if (delete != Integer.MIN_VALUE) {
                newDelete = Math.max(newDelete, delete + x);
            }

            delete = newDelete;

            ans = Math.max(ans, Math.max(keep, delete));
        }

        return ans;
    }
}
