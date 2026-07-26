class Solution {

    public int count;

    public void mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
       
       countPairs(arr,low,mid,high);


        merge(arr, low, mid, high);

    }

     public void countPairs(int arr[],int low,int mid, int high){

          int left = 0;
          int right = mid+1;
          for(int i = low; i <= mid; i++){

            while(right <= high && arr[i] > 2 * (long) arr[right] ){
                right++;
            }

            count+= (right - (mid+1));
          }

     }
    public void merge(int[] arr, int low, int mid, int high) {

        int temp[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {

                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }

        for (int x = low; x <= high; x++) {
            arr[x] = temp[x - low];
        }

    }

    public int reversePairs(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        mergeSort(arr, low, high);

        return count;
    }
}