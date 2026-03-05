class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      
       int arr[] = new int[2];
       arr[0] = 0;
       int i = 1;
        while(i < nums.length){
            if(nums[arr[0]] + nums[i] == target){
                arr[1] = i;
                break;
            }
            arr[0] = i;
            
            i++;
        }
return arr;

    }
}