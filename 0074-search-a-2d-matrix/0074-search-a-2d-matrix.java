class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {

            int l = 0;
            int r = matrix[i].length - 1;

            int mid;
            while (l <= r) {

                mid = l + (r - l) / 2;

                if (matrix[i][mid] == target) {
                    return true;
                }

                if (target < matrix[i][mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }

            }
        }

        return false;

    }
}