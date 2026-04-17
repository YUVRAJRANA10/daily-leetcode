class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
       
         ArrayList<Integer> list = new ArrayList<>();
        for(int a: nums1){
              

              map.put(a, map.getOrDefault(a,0) + 1);
        }
        
      
         for(int a: nums2){
            if(map.containsKey(a) && !list.contains(a)){
            list.add(a);
            }
        }

        int[] array = new int[list.size()];
for (int i = 0; i < list.size(); i++) {
    array[i] = list.get(i); // Auto-unboxing handles the conversion
}
   return array;


            
        }

}
