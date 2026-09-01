class Solution {
    public String shortestPalindrome(String s) {
  
       String reversed = new StringBuilder(s).reverse().toString();

     String combined = s + "#" + reversed;

       int i = 0;
       int j = 1;
       int lps[] = new int[combined.length()];
       while(j < combined.length()){
        if(combined.charAt(i) == combined.charAt(j)){
          lps[j++] = ++i;
        }
        else if(i > 0){
            i = lps[i-1]; 
        }
        else{
            j++;
        }
       }
       
       // 2. The length of the longest palindromic prefix
        int matchLen = lps[combined.length() - 1];
        
        // Prepend the unmatched portion of the reversed string to the original string
        return reversed.substring(0, s.length() - matchLen) + s;

        // a = s + rev(s);
        // lps(a);
        // lps(a) + s; 
        
    }
}