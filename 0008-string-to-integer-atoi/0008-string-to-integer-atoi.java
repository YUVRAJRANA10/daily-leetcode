class Solution {
    public int myAtoi(String s) {
    
      int n = s.length();
      int i = 0;
      long num = 0;
      int sign = 1;
      while(i < n && s.charAt(i) == ' '){
        i++;
      }
      if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
        if(s.charAt(i) == '-')sign = -1;
        
        i++;
      }
      while(i < n && Character.isDigit(s.charAt(i))){
         long a = s.charAt(i) - '0';
         num = (num * 10) + a;

         if (sign * num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
         i++;
      }

   
      return (int)num*sign;

    }
}