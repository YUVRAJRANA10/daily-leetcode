class Solution {
    public int maxArea(int[] height) {

       
      int l = 0;
      int r = height.length-1;
      int space = Integer.MIN_VALUE;
      while(l<=r){
            
            int width = r - l;
            int h = Math.min(height[l], height[r]);

            int area = h * width;
            space  = Math.max(space,area);
        if(height[l]<height[r]){
          l ++;
        }
        else{

        r--;

        }
        
     


      }


       return space;
        
        

           
    }
}