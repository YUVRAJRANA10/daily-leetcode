class Solution {

    public void solve(
        StringBuilder path,
        int open,
        int close,
        int n,
        List<String> ans
    ) {

        // Complete valid string
        if (path.length() == 2 * n) {
            ans.add(path.toString());
            return;
        }

        // Add '('
        if (open < n) {

            path.append('(');

            solve(path, open + 1, close, n, ans);

            path.deleteCharAt(path.length() - 1);
        }

        // Add ')'
        if (close < open) {

            path.append(')');

            solve(path, open, close + 1, n, ans);

            path.deleteCharAt(path.length() - 1);
        }
    }


    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        solve(
            new StringBuilder(),
            0,
            0,
            n,
            ans
        );

        return ans;
    }
}