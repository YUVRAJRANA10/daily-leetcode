class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       Arrays.sort(boxTypes,(a,b) -> Integer.compare(b[1],a[1]));

       int sum = 0;
     
       for(int i = 0; i < boxTypes.length; i++){
        
            int numbox = boxTypes[i][0];
            int unitpbox = boxTypes[i][1];

            int boxtotake = Math.min(truckSize, numbox);

            sum+= boxtotake*unitpbox;
            truckSize-=boxtotake;

            if(truckSize == 0){
                break;
            }
             
             }
     

       return sum; 
    }
}