class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String out = strs[0];   // start from first string

        for (int i = 0; i < strs.length - 1; i++) {

            String temp = "";   // reset for each comparison

            for (int j = 0; j < out.length() && j < strs[i+1].length(); j++) {

                if (out.charAt(j) == strs[i+1].charAt(j)) {
                    temp += out.charAt(j);
                } else {
                    break;
                }
            }

            out = temp;   // update prefix

            if (out.isEmpty()) return "";
        }

        return out;
    }
}