class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int presum = 0;
        int sum = 0;
        for(int i = 0; i < nums.length ; i++){
         presum+=nums[i];
         map.put(0,-1);
         if(map.containsKey(presum % k)){

            if(i - map.get(presum % k) >= 2){
                return true;
            }
         }
           else{

                map.put(presum % k,i);
            }
        
       
            

        }
        return false;
    }
}