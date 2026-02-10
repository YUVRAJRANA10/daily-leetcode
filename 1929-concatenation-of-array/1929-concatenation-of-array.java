class Solution {
    public int[] getConcatenation(int[] nums) {
        






        int len1=nums.length;
        int len2= len1+len1;
        int[] ans= new int[len2];
        int j=0;
        for (int i=0;i<len2;i++){
            if(i<len1){
                ans[i]=nums[i];
            }
            else{
                ans[i]=nums[j];
                j++;
            }
        }
        return ans;
    }
}