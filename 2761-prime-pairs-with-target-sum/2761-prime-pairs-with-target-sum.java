class Solution {
    int hash[];
    public int[] skewprime(int n){

        int size = n+1;
         hash = new int[size];
        Arrays.fill(hash,1);
        hash[0] = 0;
        hash[1] = 0;


        for(int i = 2 ; i * i < n;i++){

            if(hash[i] == 1){
                for(int j = i*i; j < n; j+=i){
                    hash[j] = 0;
                }
            }
        }

        return hash;
    }
    public List<List<Integer>> findPrimePairs(int n) {
        
      skewprime(n);

        List<List<Integer>> aa = new ArrayList<>();
        int x = 2;
        int y = n -1;
    
          
          while(x<=y){
        

          if(hash[x] == 1 && hash[y] == 1){
             List<Integer> a = new ArrayList<>();
               if(x+y == n){
                a.add(x);
                a.add(y);
                aa.add(a);
                x++;
                y--;
               }
                else if (x + y < n) {
                    x++;
                } else if (x + y > n) {
                    y--;
                }
          
          }
          else if(hash[x] == 1 && hash[y] == 0)y--;
          else if(hash[x] == 0 && hash[y] == 1)x++;
          else{
            x++;
            y--;
          }


          }
return aa;
  

    }
}