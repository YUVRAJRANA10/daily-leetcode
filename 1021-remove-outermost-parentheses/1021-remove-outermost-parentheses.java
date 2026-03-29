class Solution {
    public String removeOuterParentheses(String expr) {


       Stack<Character> st = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for(char c : expr.toCharArray()){
          if(st.isEmpty() && c == '('){
            st.push(c);
            continue;
          }
          else if(!st.isEmpty() && c == '('){
                 sb.append(c);
                 st.push(c);
              }
                 else{
                    
                    st.pop();

                    if(!st.isEmpty()){
                        sb.append(c);
                    }

                  }
              
            
          }



          return sb.toString();
      }
       
        
    }
