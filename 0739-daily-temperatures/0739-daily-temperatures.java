class Solution {
    public int[] dailyTemperatures(int[] arr) {
        
        Stack<Integer> st = new Stack<>();
 int res[] = new int[arr.length];
        for(int i = arr.length -1; i >=0 ; i--){
            
             
             while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                 st.pop();
             }
             if(st.isEmpty()){
                 res[i] = 0;
             }
             else{
                 res[i] = st.peek() - i;
             
             }
                st.push(i);
        
        }
        return res;



    }
}