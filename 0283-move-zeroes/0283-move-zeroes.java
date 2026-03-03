class Solution {
    public void moveZeroes(int[] arr) {
//                 int[] arr2 = new int[arr.length];
// int ptr = 0;
//           for(int i = 0; i < arr.length ; i++){
//            if(arr[i] != 0){
//             arr2[ptr] = arr[i];
//             ptr++;
//            }
//           }

//            for(int j = ptr; j < arr2.length; j++){
//             arr2[j] = 0;
//            }
           

//            for(int i = 0; i < arr.length; i++){
//             arr[i] = arr2[i];
//            }

            int ptr = 0;

        for(int i = 0; i < arr.length  ; i++){
            
           if(arr[i] != 0){
            int temp = arr[ptr];
            arr[ptr] = arr[i];
            arr[i] = temp;
            ptr++;
           }

          }
    }
}