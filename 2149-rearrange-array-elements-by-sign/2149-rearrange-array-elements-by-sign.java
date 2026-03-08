class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = -2;
        int neg = -1;
        int arr[] = new int[nums.length];
       for(int i = 0; i < nums.length ; i++){

        if(nums[i] > 0){
            pos+=2;
            arr[pos] = nums[i];
        }
        else{
            neg+=2;
            arr[neg] = nums[i];
        }
       }


return arr;
    }
}