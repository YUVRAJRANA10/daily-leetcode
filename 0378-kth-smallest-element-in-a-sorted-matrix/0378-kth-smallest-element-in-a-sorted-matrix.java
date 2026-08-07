class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r = matrix.length;
        int c = matrix[0].length;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < r*c; i++) {
            int n = matrix[i/c][i%c];
            pq.add(n);
            if (pq.size() > k)
                pq.poll();

        }

        return pq.peek();
    }
}