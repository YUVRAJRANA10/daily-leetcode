import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // store frequency
        for (int num : nums) {
            map.put(num, 1);
        }
        
        int n = nums.length;
        
        // check from 0 to n
        for (int i = 0; i <= n; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        
        return -1; // never happens
    }
}