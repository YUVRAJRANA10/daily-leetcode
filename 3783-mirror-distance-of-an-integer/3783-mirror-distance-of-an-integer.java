class Solution {
    int reverse(int n){
        int m = 0;
        while(n> 0){
            int rem = n%10;
            m = m * 10 + rem;
            n = n/10;
        }
        return m;
    }
    public int mirrorDistance(int n) {
        int r = reverse(n);
        return Math.abs(n-r);
    }
}