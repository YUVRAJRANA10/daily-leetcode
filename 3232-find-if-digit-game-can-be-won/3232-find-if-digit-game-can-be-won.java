class Solution {
    public boolean canAliceWin(int[] nums) {
        int s = 0;
        int d = 0;
        for(int a:nums){
            if( a < 10){
                s+=a;
            }
            else{
             d+=a;
            }
        }



        if(s!=d){
            return true;
        }

        return false;
    }
}