class Solution {
    public String reverseVowels(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {

                st.push(c);
            }

        }

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {

            char c = chars[i];

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {

                        sb.append(st.pop());

            } else {
                sb.append(c);
            }

        }

        return sb.toString();

    }
}