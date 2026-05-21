class Solution {
    public int differenceOfSum(int[] nums) {

        int sum = 0;
        int dig = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i : nums) {
            if (i < 10) {
                dig += i;

            }
            else{
                
                while(i>0){
                    int rem = i%10;
                    i = i/10;
                    dig+=rem;
                }
            }

        }

        return Math.abs(dig - sum);

    }
}