import java.util.*;

public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        backtrack("", 0, 0, n, result);

        return result;
    }

    public void backtrack(String current, int open, int close,
                          int n, List<String> result) {

        // Base case
        if (open == n && close == n) {
            result.add(current);
            return;
        }

        // Add '('
        if (open < n) {
            backtrack(current + "(", open + 1, close, n, result);
        }

        // Add ')'
        if (close < open) {
            backtrack(current + ")", open, close + 1, n, result);
        }
    }
}