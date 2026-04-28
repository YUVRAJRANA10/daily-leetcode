class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> map = new HashMap<>();        
      Stack<Integer> st = new Stack<>();

     for(int i = nums2.length-1; i >= 0 ; i--){
          
          while(!st.isEmpty() && nums2[i] > st.peek()){
            st.pop();
          }


          if(st.isEmpty()){
            // nums2[i] = -1;

            map.put(nums2[i],-1);
          }
        else{

            // nums2[i] = st.peek();
            map.put(nums2[i],st.peek());
        }

          st.push(nums2[i]);


     }


    for(int i = 0; i < nums1.length; i++){
        
        nums1[i] = map.get(nums1[i]);
      

        
    }



return nums1;




    }
}