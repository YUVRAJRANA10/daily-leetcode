class Solution {
    public double findMaxAverage(int[] arr, int k) {
        



              
        int l = 0;
        int r = 0;
        
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        while(r< arr.length){
            sum+=arr[r];
            int len = r-l+ 1;
              if(len==k){
                max = Math.max(sum,max);
                sum -= arr[l];
                l++;
            }
            r++;
        }
        
        return (double)max/k;
        
    }
}