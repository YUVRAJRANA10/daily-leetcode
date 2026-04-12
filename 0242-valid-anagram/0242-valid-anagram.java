class Solution {
    public boolean isAnagram(String s, String t) {
        

char[] chars = s.toCharArray();
char[] chars2 = t.toCharArray();

Arrays.sort(chars);
Arrays.sort(chars2);

String sorteds = new String(chars); 
String sortedt = new String(chars2);


if(sorteds.equals(sortedt)){
    return true;
}

return false;
// Results in "abcde"


    }
}