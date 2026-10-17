
/**
 * The rand7() API is already defined for you.
 * public int rand7();
 */

class Solution extends SolBase {
    public int rand10() {
        while (true) {
            int a = rand7();
            int b = rand7();

            int num = (a - 1) * 7 + (b - 1);

            if (num < 40) {
                return (num % 10) + 1;
            }
        }
    }
}
