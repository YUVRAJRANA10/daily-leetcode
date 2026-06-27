class Solution {
    int size = 1000000;
    int prime[] = new int[size + 1];

    public void prime(int n) {
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i * i <= n; i++) {

            if (prime[i] == 1) {

                for (int j = i * i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }

    }



    public int[] closestPrimes(int left, int right) {
        prime(right);
        int ans[] = {-1,-1};
        int prev = -1; // initially the previous prime which we have seen

        int minDiff = Integer.MAX_VALUE; // current smallest differnce

        for(int i = left; i <= right; i++){
           if(prime[i] == 0){
            continue;
           }

           if(prev != -1 && i - prev < minDiff){
            minDiff = i - prev;

           ans[0] = prev;
           ans[1] = i;
           }

           
           prev = i;


        }
        


        return ans;


    }
}