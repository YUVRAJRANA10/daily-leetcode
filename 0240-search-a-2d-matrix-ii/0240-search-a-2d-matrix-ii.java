class Solution {
    // public boolean bs(int matrix[],int target){
    //      int left = 0;
    //      int right = matrix.length -1;
    //      while(left <= right){
    //         int mid = (left + right) / 2;
    //        if(matrix[mid] == target) return true;
    //         if(target < matrix[mid]){
    //             right = mid -1;
    //         }
    //         else{
    //             left = mid+1;
    //         }
    //      }
    //      return false;
    // }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
         
          int l = 0, r = col -1;

          while(l < row && r >= 0){

            if(matrix[l][r] == target)return true;

            if(matrix[l][r] < target){
             
                l++;

            }
            else{
                r--;
            }
          }
          return false;
        
    }
}