class Solution {
    int size = 1000000;
    int prime[] = new int[size + 1];
    

    public void prime(int n){
         Arrays.fill(prime,1);
    prime[0]=0;
    prime[1]=0;
         for(int i = 2; i*i < n;i++ ){

            if(prime[i] == 1){

                for(int j = i * i;j < n;j+=i){
                    prime[j] = 0;
                }
            }
         }


    }

    public List<List<Integer>> findPrimePairs(int n) {
        prime(n);
        int x = 2;
        int y = n-1;
List<List<Integer>> l1 = new ArrayList<>();
        while(x<=y){

          List<Integer> l2 = new ArrayList<>();
             if(prime[x] == 1 && prime[y] == 1){
                
                if(x+y == n){
                   l2.add(x);
                   l2.add(y);
                   l1.add(l2);
                   x++;
                   y--;
                   continue;
                }
                else if(x+y<n){
                    x++;
                }
                else if(x+y>n){
                    y--;
                }

             }
             else{
             if(prime[x] == 1 && prime[y] == 0){
             y--;   

             }
            else if(prime[x] == 0 && prime[y] == 1){
                x++;

             }
             else{
                x++;
                y--;
             }
             }

           
        }

        
return l1;
    }
}