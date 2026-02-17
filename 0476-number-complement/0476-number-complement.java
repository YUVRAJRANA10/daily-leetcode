class Solution {
    public int findComplement(int num) {
        String nums = "";
        String str = Integer.toBinaryString(num);
        for(int i = 0; i < str.length(); i++){
         if(str.charAt(i) == '1'){
            nums+="0";
         }
         else{
            nums+="1";
         }

        }



        return Integer.parseInt(nums,2);
    }
}