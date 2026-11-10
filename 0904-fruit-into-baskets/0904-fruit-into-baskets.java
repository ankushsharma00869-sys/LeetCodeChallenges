
import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < fruits.length; right++) {

            int fruit = fruits[right];

            // Add fruit into window
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);

            // More than 2 types? Shrink window
            while (map.size() > 2) {

                int leftFruit = fruits[left];

                map.put(leftFruit, map.get(leftFruit) - 1);

                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }

                left++;
            }

            // Update maximum window size
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
