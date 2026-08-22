class Solution {
    public int maximumWealth(int[][] ac) {
        int max = 0;
        for(int i = 0; i <ac.length; i++){
            int sum = 0;
            for(int j = 0; j < ac[i].length; j++){
                sum+=ac[i][j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}