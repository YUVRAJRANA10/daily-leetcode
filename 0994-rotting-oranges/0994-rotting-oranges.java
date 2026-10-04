class Solution {
    public int orangesRotting(int[][] grid) {

        int fresh = 0;
        int row = grid.length;
        int col = grid[0].length;
        int minutes = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                }
                else if (grid[i][j] == 1) {
                    fresh++;
                }

            }
        }
        if (fresh == 0) return 0;

        int[][] directions = {
                { -1, 0 },
                { 1, 0 },
                { 0, 1 },
                { 0, -1 }
        };

        while (!q.isEmpty()) {
            int size = q.size();
            boolean rottedNew = false;
            for (int k = 0; k < size; k++) {
                int[] currq = q.poll();
                int r = currq[0];
                int c = currq[1];

                for (int i = 0; i < directions.length; i++) {
                    int currntdir[] = directions[i];
                    int rn = r + currntdir[0];
                    int cn = c + currntdir[1];

                    if (rn >= 0 && cn >= 0 && rn < row && cn < col && grid[rn][cn] == 1) {
                        q.add(new int[] { rn, cn });
                        grid[rn][cn] = 2;
                        rottedNew = true;
                        fresh--;
                    }
                }
            }
            if(rottedNew){
            minutes++;}
        }

        if (fresh > 0)
            return -1;
        return minutes;
    }
}