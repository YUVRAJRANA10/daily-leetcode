class Solution {

    public int f( String s1,int i,String s2,int j,int[][]dp){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!= -1)return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j))return 1+f(s1,i-1,s2,j-1,dp);
        
        int iless = f(s1,i-1,s2,j,dp);
        int jless = f(s1,i,s2,j-1,dp);
        dp[i][j] = Math.max(iless,jless);
        return dp[i][j];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length() - 1;
        int l2 = text2.length() -1;
        int dp[][] = new int[l1+1][l2+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return f(text1,l1,text2,l2,dp);
    }
}