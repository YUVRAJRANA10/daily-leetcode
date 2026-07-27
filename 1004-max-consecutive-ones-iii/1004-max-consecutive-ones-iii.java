class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r  = 0;
        int maxlen = 0;
int cnt = 0;
        while(r<nums.length){
            if(1 == nums[r])cnt++;

            if((r-l+1) - cnt > k){
                if(nums[l] == 1)cnt--;
                l++;
            }
            if((r-l+1) - cnt <= k){
               maxlen = Math.max(maxlen,r-l+1);
            }
        r++;
        }

        return maxlen;
    }
}