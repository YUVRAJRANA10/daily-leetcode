class Solution {
     int array[] = new int[101];


    public void prime(int n){
        Arrays.fill(array,1);
        array[0] = 0;
        array[1] = 0;

        for(int i = 2; i*i<= n; i++){
            if(array[i] == 1){
                for(int j = i*i; j <= n; j+=i){
                    array[j] = 0;
                }

            }
        }
    }

public long permutation(int n, long MOD) {
    long res = 1;
    for (int i = 1; i <= n; i++) {
        res = (res * i) % MOD;
    }
    return res;
}


    public int numPrimeArrangements(int n) {
        prime(n);
         int prime_count = 0;
        for(int i = 0; i <= n; i++){
                 if(array[i] == 1){
                    prime_count++;
                 }
        }          
        long mod = 1_000_000_007;

long res =  (permutation(prime_count,mod) * permutation(n-prime_count,mod)) % mod;


return (int) res;
    }
}