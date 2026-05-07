class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int n: hours){
            if(n>=target){
                count++;
            }
        }
        return count;
    }
}