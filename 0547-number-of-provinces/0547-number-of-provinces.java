class Solution {
    public void dfs(int x, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

        visited[x] = true;

        for (int y : adj.get(x)) {

            if (!visited[y]) {

                dfs(y, adj, visited);
            }
        }

    }

    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int V = isConnected.length;
        for (int i = 0; i < V; i++) {
            ans.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1) {
                    ans.get(i).add(j);
                }
            }
        }

        boolean[] visited = new boolean[V];
        int connected = 0;

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {
                connected++;
                dfs(i, ans, visited);
            }
        }
        return connected;
    }
}