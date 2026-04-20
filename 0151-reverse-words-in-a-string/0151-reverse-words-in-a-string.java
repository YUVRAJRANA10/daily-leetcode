class Solution {
    public String reverseWords(String s) {

        String curr = "";
        s = s.trim();
    
        String[] arr = s.split("\\s+");

        for (int i = arr.length - 1; i >= 0; i--) {
   
            curr += arr[i];
            if(i == 0){
                continue;
            }
            curr += " ";

        }

        return curr.trim();
    }
}