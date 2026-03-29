class Solution {
    public String removeOuterParentheses(String expr) {

    //      #1 approach
    //    Stack<Character> st = new Stack<>();

        StringBuilder sb = new StringBuilder();
    //     for(char c : expr.toCharArray()){
    //       if(st.isEmpty() && c == '('){
    //         st.push(c);
    //         continue;
    //       }
    //       else if(!st.isEmpty() && c == '('){
    //              sb.append(c);
    //              st.push(c);
    //           }
    //              else{
                    
    //                 st.pop();

    //                 if(!st.isEmpty()){
    //                     sb.append(c);
    //                 }

    //               }
              
            
    //       }



    //       return sb.toString();


        int counter = 0;
        for(char c : expr.toCharArray()){
   
          if(c == '('){
             if(counter == 0){
                counter++;
            continue;
          }
            counter++;
            sb.append(c);
          }
          else if(c == ')'){
            counter--;
             if(counter == 0){
            continue;
          }
            sb.append(c);
          }
              
            
          }



      return sb.toString();
      }
       
        
    }
