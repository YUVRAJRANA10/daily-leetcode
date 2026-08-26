class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int len= 0;
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i+j)) {
                    break;
                }
                len++;
            }

            if (len == needle.length()) {
                return i;
            }
        }

        return -1;

        // return haystack.indexOf(needle);
    }
}