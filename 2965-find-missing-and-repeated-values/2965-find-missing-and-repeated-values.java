class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int hash[] = new int[n * n + 1];
        Arrays.fill(hash,0);
        hash[0] = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < grid[i].length;j++){
                hash[grid[i][j]]++;
            }
        }
        int a = -1;
        int b = -1;


       for(int i = 0; i < hash.length; i++){
        if(hash[i] == 2){
            b = i;
        }

        if(hash[i] == 0){
            a = i;
        }
       }
    
    return new int[]{b,a};
        

    }
}