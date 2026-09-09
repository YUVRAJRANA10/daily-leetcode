class Solution {
    public int repeatedStringMatch(String a, String b) {
        String rep = a;

        for (char c : b.toCharArray()) {
            if (!a.contains(String.valueOf(c))) {
                return -1;
            }
        }

        int i = 1;
        while (!a.contains(b)) {
            if (a.length() > b.length() + 2 * rep.length()) {
                return -1;
            }
            a += rep;
            i++;
        }

        return i;
    }
}