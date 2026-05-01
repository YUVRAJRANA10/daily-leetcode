class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i = 0; i <= 25 ; i++){
           char c = (char) ('a' + i);
            if(!sentence.contains(String.valueOf(c))){
                return false;
            }
        }

        return true;
    }
}