class Solution {
    public boolean bs(int matrix[],int target){

         int left = 0;
         int right = matrix.length -1;
         while(left <= right){

            int mid = (left+right)/2;
           if(matrix[mid] == target)return true;
            if(target < matrix[mid]){
                right = mid -1;
            }
            else{
                left = mid+1;
            }
         }
         return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0; i < row; i++){
            if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length -1]){
            if(bs(matrix[i],target))return true;}
        }
        return false;
        
    }
}