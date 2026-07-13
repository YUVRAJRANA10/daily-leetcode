class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();


        int l = 0;
        int r = 0;
        long max = 0;
        long sum = 0;
      
     
        while (r < nums.length) {
        sum+=nums[r];
        map.put(nums[r],map.getOrDefault(nums[r],0) + 1);
        
        if(r-l+1 > k){
            sum-=nums[l];
           map.put(nums[l],map.getOrDefault(nums[l],0) - 1);
           if(map.get(nums[l]) == 0){
            map.remove(nums[l]);
           }

            l++;
        }
        if(k == r-l+1){
            
            if(map.size() == k ){
                max = Math.max(max,sum);
            }
        }

        r++;  
        }

        return max;

    }
}