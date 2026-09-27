class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int rans[] = new int[256];
        Arrays.fill(rans,0);
        for(char c: ransomNote.toCharArray()){
            rans[c-'0']++;
        }
         for(char c: magazine.toCharArray()){
            rans[c-'0']--;
        }
         for(char c: ransomNote.toCharArray()){
           if( rans[c-'0'] > 0)return false;
        }
        return true;
    }
}