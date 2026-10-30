class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int l = 0;
      int r = 0;
      int max = Integer.MIN_VALUE;
      int sum = 0;
      while(r<nums.length){

        if(r-l+1< k){
            sum+=nums[r];
            r++;
        }
        else{  
            sum+=nums[r];
               max = Math.max(sum,max);
               sum-=nums[l];
               l++;
               r++;
        }
      }
        
        return (double)max/k;
        
    }
}