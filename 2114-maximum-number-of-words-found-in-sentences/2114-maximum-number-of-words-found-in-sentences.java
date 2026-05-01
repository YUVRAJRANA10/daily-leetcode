class Solution {
    int max = 0;
    public int mostWordsFound(String[] sentences) {
        for(String sentence : sentences){
          int count  = 0;
            for(String word : sentence.split(" "))
            {
               count++;
            }

            max = count>max?count:max;
        }

        return max;
    }
}