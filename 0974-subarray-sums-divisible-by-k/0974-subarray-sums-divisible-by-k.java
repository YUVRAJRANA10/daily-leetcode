class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        


        HashMap<Integer,Integer> map = new HashMap<>();
     int presum = 0;
     int rem = 0;
     int subarr = 0;;
map.put(0,1);
        for(int i = 0; i < nums.length; i++){
        presum+=nums[i];
        rem = ((presum % k)+k)%k;

        if(map.containsKey(rem)){
            subarr+=map.get(rem);
        }
        
        map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return subarr;
    }
}