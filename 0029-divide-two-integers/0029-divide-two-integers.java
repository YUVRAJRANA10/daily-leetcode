class Solution {
    public int divide(int dividend, int divisor) {
        
             if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        if(divisor == 1) return dividend;
        if(divisor == -1)return -dividend;

        boolean negative = false;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)){
            negative = true;
        }
     
      long a = Math.abs((long)dividend);
      long b = Math.abs((long)divisor);

      int ans = 0;
      while(a>=b){

        a = a-b;
        ans++;
      }

      return negative ? -ans : ans;


    }
}