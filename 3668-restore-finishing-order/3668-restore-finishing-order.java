class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
         int arr[] = new int[friends.length];
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int x:friends){
            map.put(x,1);
         }
         int i = 0;
         for(int x: order){
            if(map.containsKey(x)){
                arr[i++] = x;
            }
         }
         return arr;

       

    }
}