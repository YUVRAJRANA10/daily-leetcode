class Solution {
    public int calculate(String s) {
        s = s.trim();
        String processed = infixtoPostfix(s);

        return posteval(processed);
    }

    public int precedence(char c) {
        if (c == '+' || c == '-')
            return 1;
        else if (c == '*' || c == '/')
            return 2;
        else
            return -1;
    }

    public String infixtoPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }

            else if (Character.isDigit(c)) {
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                    i++;
                }
                i--;
                sb.append(" ");

            } else {

                while (!st.isEmpty() && precedence(st.peek()) >= precedence(c)) {
                    sb.append(st.pop()).append(" ");
                }
                st.push(c);
            }

        }

        while (!st.isEmpty()){
            sb.append(st.pop()).append(" ");}

        return sb.toString().trim();
    }

    public int posteval(String s){
      String[] tokens =  s.split("\\s+");
      Stack<Long> stack = new Stack<>();

      for(String token: tokens){
         if (token.equals("+")) {
            long b = stack.pop();
            long a = stack.pop();
            stack.push(a + b);
        } else if (token.equals("-")) {
            long b = stack.pop();
            long a = stack.pop();
            stack.push(a - b);
        }
        else if (token.equals("*")) {
            long b = stack.pop();
            long a = stack.pop();
            stack.push(a * b);
        }
        else if (token.equals("/")) {
            long b = stack.pop();
            long a = stack.pop();
            stack.push(a / b);
        }
         else {
            stack.push(Long.parseLong(token));
        }
      }

      return stack.pop().intValue();
    }
}