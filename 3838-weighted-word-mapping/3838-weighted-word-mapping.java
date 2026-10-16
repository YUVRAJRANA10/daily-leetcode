class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String s:words){
            int x = 0;
            for(char c: s.toCharArray()){
             int i = (int)c-97;
            x+=weights[i];
            }
            x = x % 26;
            int num = 26-x;
            
            char c = (char)(96+num);
            sb.append(c);
        }
        return sb.toString();
    }
}