class Solution {
    public int maxDistinct(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
        }
        return map.size();
    }
}