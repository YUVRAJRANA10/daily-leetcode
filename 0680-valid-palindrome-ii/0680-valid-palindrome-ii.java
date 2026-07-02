class Solution {

    public boolean pallindrome(String s, int l,int r){
             
             int left = l;
             int right = r;

             while(left < right){

                if(s.charAt(left) != s.charAt(right) ){
                    return false;
                }
                left++;
                right--;
             }

             return true;
    }
    public boolean validPalindrome(String s) {
        

        int left = 0;
        int right = s.length() - 1;

        while(left < right){

             if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
             }
             else{

                return pallindrome(s,left+1,right) || pallindrome(s,left,right-1);
             }
        }
return true;

    }
}