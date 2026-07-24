class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        // Edge case: if s is shorter than p, an anagram is impossible
        if (s.length() < p.length())
            return result;

        int k = p.length();
        int l = 0;
        int r = 0;
        int hash[] = new int[26];
        int[] windowHash = new int[26];

        for (int i = 0; i < p.length(); i++) {
            hash[p.charAt(i) - 'a']++;
        }

        while (r < s.length()) {

            windowHash[s.charAt(r) - 'a']++;
            if (r - l + 1 == k) {

                if (Arrays.equals(hash, windowHash)) {
                    result.add(l);
                }

                windowHash[s.charAt(l) - 'a']--;
                l++;

            }

            r++;

        }

        return result;

    }
}