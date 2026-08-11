class Solution {
    public boolean find132pattern(int[] nums) {
Stack<Integer> st = new Stack<>();
int S3 = Integer.MIN_VALUE;
   for(int i  = nums.length - 1; i>=0 ; i--){


     if(nums[i] < S3)return true;
    while(!st.isEmpty() && nums[i] > st.peek()){
        S3 = st.pop();
        
    }
st.push(nums[i]);

   }
   return false;
    }
}