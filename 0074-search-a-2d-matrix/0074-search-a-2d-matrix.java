class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


            int m = matrix.length;
            int n = matrix[0].length;

            int l = 0;
            int r = m * n -1;
            int mid;
            while (l <= r) {

                mid = l + (r - l) / 2;
                          
                if (matrix[mid/n][mid % n] == target) {
                    return true;
                }

                if (target < matrix[mid/n][mid % n]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }

            }

        return false;

    }
}