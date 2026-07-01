class Solution {
    public boolean isPalindrome(String s) {
        int l  = 0;
        s = s.toLowerCase();
        int r = s.length() - 1;

        while(l<r){
            while(l<r && !isAlphanumeric(s.charAt(l)))l++;
               while(l<r && !isAlphanumeric(s.charAt(r)))r--;

               if(s.charAt(l) != s.charAt(r)){
                return false;
               }
               l++;
               r--;
        }
        return true;
    }


    public boolean isAlphanumeric(char c){

        return ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }
}