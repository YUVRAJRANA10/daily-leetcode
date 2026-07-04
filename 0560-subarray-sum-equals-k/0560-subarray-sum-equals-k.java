class Solution {
public int subarraySum(int[] nums, int k) {
    // Map: Key = Prefix Sum, Value = How many times this sum has been seen
    HashMap<Integer, Integer> map = new HashMap<>();
    
    // Crucial: Base case. A sum of 0 has been seen once (before the array starts)
    map.put(0, 1);
    
    int presum = 0;
    int count = 0;
    
    for (int i = 0; i < nums.length; i++) {
        presum += nums[i];
        
        // If (presum - k) exists, it means we found subarrays 
        // that sum to k. Add the frequency of that sum to our total.
        if (map.containsKey(presum - k)) {
            count += map.get(presum - k);
        }
        
        // Update the frequency of the current prefix sum
        map.put(presum, map.getOrDefault(presum, 0) + 1);
    }
    
    return count;
}
}