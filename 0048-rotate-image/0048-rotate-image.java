class Solution {
    public void rotate(int[][] matrix) {
        
        
        int r =  matrix.length;
        int col = matrix[0].length;
        // int result[][] = new int[r][c];
        for(int i = 0; i < r; i++){

           for(int j = 0; j < i; j++){

            int temp = matrix[j][i];
            matrix[j][i] = matrix[i][j];
            matrix[i][j] = temp;
           }

        }
        

        for(int i = 0;  i < r; i++){

            int l = 0;
            int rln = matrix[i].length - 1;

            while(l<rln){
                int temp =  matrix[i][l];
                matrix[i][l] = matrix[i][rln];
                matrix[i][rln] = temp;
                l++;
                rln--;
            }
        }
    }
}