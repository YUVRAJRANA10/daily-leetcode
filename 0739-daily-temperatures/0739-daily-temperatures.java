class Solution {
    public int[] dailyTemperatures(int[] temp) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < temp.length;i++){
            map.put(temp[i],i);
        }

        Stack<Integer> st = new Stack<>();

        int arr[] =  new int[temp.length];
        for(int i = temp.length -1; i>=0; i--){
        while(!st.isEmpty() && temp[st.peek()] <= temp[i])
        {
            st.pop();
        }
        if(st.isEmpty()){
            arr[i] = 0;
        }
        else{
            arr[i] = st.peek() - i;
        }
        st.push(i);
        }

        return arr;
    }
}