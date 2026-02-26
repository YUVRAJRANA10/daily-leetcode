class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i <= n -2; i++){
            StringBuilder rev = new StringBuilder();

            String num = Integer.toBinaryString(i);
            rev.append(num);
            if(rev.toString() != num){
                return false;
            }
        }

        return true;
    }
}