class Solution {
    public int jump(int[] nums) {
        int maxreach = 0;
        int currentjump = 0;
        int jump = 0;

        for (int i = 0; i < nums.length; i++) {
            maxreach = Math.max(maxreach, i + nums[i]);
            if(currentjump == nums.length - 1)break;
            if(currentjump == i){
               jump++;
               currentjump = maxreach;
            }
     
        }
        return jump;
    }
}