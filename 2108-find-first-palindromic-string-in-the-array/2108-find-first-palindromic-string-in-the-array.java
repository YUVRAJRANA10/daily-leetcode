class Solution {
    public String firstPalindrome(String[] words) {
       for(int i = 0; i < words.length; i++){

        String s = words[i];
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right){
           
           if(s.charAt(left) != s.charAt(right)){
            break;
           }
           
           left++;
           right--;
        }
     if(left >= right){
        return s;
     }

       }


       return ""; 


    }
}