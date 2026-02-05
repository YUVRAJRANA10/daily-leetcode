class Solution {
    public boolean isValid(String s) {
    //     int open = 0;
    //     int close = 0;
    //   for(char c : s.toCharArray()){

    //     if( c == '{' || c == '(' || c == '['){
    //       open++;
    //     }
    //     else{
    //         if(open > close){

                       
    //             return 
    //         }

    //     }
        Stack<Character> stack = new Stack<>(); // Declare a character stack

        for (char c : s.toCharArray()) {
            // If an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // If a closing bracket, pop from stack and check for a match
            else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } 
            else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            } 
            else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
        }




      

      return stack.isEmpty();

    }
}