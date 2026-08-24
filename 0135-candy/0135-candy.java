class Solution {
    public int candy(int[] ratings) {
        
        int ans[] = new int[ratings.length];
        Arrays.fill(ans,1);

        for(int i = 1; i < ratings.length; i++){
            if(ratings[i-1] < ratings[i]){
                ans[i] = ans[i-1] + 1;
            }

        }

        for(int i = ratings.length -2; i>= 0; i--){

            if(ratings[i]  > ratings[i+1]){
                ans[i]= Math.max(ans[i] , ans[i+1] +1);
            }
        }

        int totalCandies = 0;
        for (int an : ans) {
            totalCandies += an;
        }
        
        return totalCandies;

    }
}