class Solution {
    public void setZeroes(int[][] matrix) {
        
        int r = matrix.length;
        int c = matrix[0].length;
        int cpmatrix[][] = new int[r][c];



       for(int i = 0; i < r; i++){

            for(int j = 0; j < matrix[i].length; j++){
                
                cpmatrix[i][j] = matrix[i][j];
            }
        }



        for(int i = 0; i < r; i++){

            for(int j = 0; j < cpmatrix[i].length; j++){

                     if(cpmatrix[i][j] == 0){

                        for(int k = 0 ; k < cpmatrix[i].length; k++){

                            matrix[i][k] = 0;
                        }

                        for(int k = 0 ; k < r; k++){

                            matrix[k][j] = 0;
                        }

                     }
            }
        }


    }
}