class Solution {
   
   public boolean isprime(int a){
     if(a<=1)return false;
        for(int i = 2; i*i <= a; i++){
         
            if(a % i == 0)return false;
        }

        return true;
   }
    public int diagonalPrime(int[][] nums) {
        
        int maxprime = 0;

        for(int i = 0; i < nums.length; i++){

            if(isprime(nums[i][i]) && nums[i][i] > maxprime){
                maxprime = nums[i][i];
            }
        }
        int col = nums[0].length - 1;
   for(int i = 0; i < nums.length; i++){

            if(isprime(nums[i][col]) && nums[i][col] > maxprime){
                maxprime = nums[i][col];
            }
            col--;
        }

        return maxprime;

    }
}