class Solution {
    public int trap(int[] height) {
        
          
     int leftmax[] = new int[height.length];
     leftmax[0] = height[0];
     for(int i = 1; i < height.length; i++){

         leftmax[i] = Math.max(leftmax[i-1],height[i]);

     }
     int rightmax[] = new int[height.length];
     rightmax[height.length - 1] = height[height.length -1];
     for(int j = height.length-2; j >=0; j--){
      rightmax[j] = Math.max(rightmax[j+1],height[j]);
     }

     int water = 0;
   
     for(int i = 0;i< height.length;i++){

water+= Math.min(leftmax[i],rightmax[i]) - height[i];
     }


return water;


    }
}