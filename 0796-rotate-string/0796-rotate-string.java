class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String sum = s + s;

        if (sum.contains(goal)) {
            return true;
        }
        return false;

    }
}