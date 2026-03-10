class Solution {
    public boolean isPowerOfThree(int n) {
        // base cases
        if (n == 1) return true;
        if (n <= 0 || n % 3 != 0) return false;

        // recursive call
        return isPowerOfThree(n / 3);
    }
}
