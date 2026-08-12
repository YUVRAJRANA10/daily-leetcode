class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        boolean[] arr = new boolean[s.length()];

        for(int i =0 ; i < s.length(); i++){
            char c = s.charAt(i);
           if(c == '('){
            st.push(i);
           }
           else if(c == ')'){

            if(st.isEmpty()){
                arr[i] = true;
                continue;
            }
            else{
                st.pop();
            }
           }
           arr[i] = false;

        }

        while(!st.isEmpty()){
            arr[st.pop()] = true;
        }
        


        for(int i = 0; i < arr.length; i++){
            if(arr[i] == true){
                continue;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}