class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        int i = 0; 
         for(char c: s.toCharArray()){
                 if(!map.containsValue(t.charAt(i))){
                 map.put(c,t.charAt(i) );
                 
                 }
                 i++;

         }

         StringBuilder sb = new StringBuilder();

         for(char c: s.toCharArray()){
               sb.append(map.get(c));
         }


         if(sb.toString().equals(t)){
            return true;
         }


         return false;
        
    }
}