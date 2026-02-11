class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxlen = 0;
        int len = 0;
    
       for(int i = 0; i < s.length(); i++){

         int hash[] = new int[256];

            for(int j = i; j < s.length();j++){
                    char c = s.charAt(j);

                    if(hash[c] == 1){
                        break;
                    }

                    hash[c] = 1;
                    len = j - i + 1;
                    maxlen = Math.max(maxlen,len);
             
            }

       }




    return maxlen;




    }
}