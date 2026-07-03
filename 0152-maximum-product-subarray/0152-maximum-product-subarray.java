class Solution {
    public int maxProduct(int[] nums) {
        

        int maxSum = Integer.MIN_VALUE;
        int currSum = 1;

        for(int i = 0; i < nums.length; i++){

            currSum *= nums[i];

            if(currSum > maxSum){
                maxSum = currSum;
            }

            if(currSum == 0){
                currSum = 1;
            }
        }
        

      currSum = 1;
        for(int j = nums.length -1; j >= 0; j--){
                currSum *= nums[j];

            if(currSum > maxSum){
                maxSum = currSum;
            }

            if(currSum == 0){
                currSum = 1;
            }   
 
        }
 
        return maxSum;


    }
}