class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>(); // Declare a character stack

        for (char c : s.toCharArray()) {
            // If an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            else{
                   
             if(!stack.isEmpty()){
                 
                   if(c == ')' && stack.pop() != '(')return false;
                   else if(c == ']' && stack.pop() != '[')return false;
                   else if(c == '}' && stack.pop() != '{')return false;

             }
             else{
                return false;
             }

            }
        
        }

      return stack.isEmpty();

    }
}