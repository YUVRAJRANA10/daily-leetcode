class Solution {
    public int[] nextGreaterElement(int[] num, int[] arr) {
        
     Stack<Integer> st = new Stack<>();
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i  = 0; i < num.length; i++){

        map.put(num[i],i);
     }
        

        int res[] = new int[num.length];
        for(int i = arr.length -1; i >=0 ; i--){
            
             
             while(!st.isEmpty() && st.peek() <= arr[i]){
                 st.pop();
             }
             if(st.isEmpty()){
                if(map.containsKey(arr[i])){
                 int index = map.get(arr[i]);
                res[index] = -1;}
             }
             else{
                if(map.containsKey(arr[i])){
                   int index = map.get(arr[i]);
                res[index] = st.peek();}
             
             }
                st.push(arr[i]);
        
        }
    
       
       return res;



    }
}