class Solution {
    public int removeDuplicates(int[] arr) {

//         LinkedHashSet<Integer> set = new LinkedHashSet<>();
       

//         for (int a : nums) {

//             set.add(a);
//         }
// {0,1,2,4,5}
//         int count = 0;

//         for (int a : set) {

//             nums[count] = a;
//             count++;

//         }

//         return count;


    //     if (nums.length == 0) return 0;

    //     int k = 1; 

    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[i] != nums[i - 1]) {
    //             nums[k] = nums[i];
    //             k++;
    //         }
    //     }
    //     return k;
    // }


int i = 0;
int j = 1 ;
while( j <=arr.length - 1){

if(arr[j] != arr[i]){
    
        arr[i+1] = arr[j];
    
  i++;
}

j++;
}


return i+1;

    }
}
