class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int cols = matrix[0].length;
        int heights[] = new int[cols];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
               
               for(int j = 0 ; j<cols; j++){
                    if(matrix[i][j] == '1'){
                        heights[j] += 1;
                    }
                    else {
                        heights[j] = 0;
                    }

               }

               max = Math.max(max,largestrect(heights));


        }
        return max;
    }


    public int largestrect(int[] arr){
  Stack<Integer> st = new Stack<>();
        int prevres[] = new int[arr.length];
        int nextres[] = new int[arr.length];


        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nextres[i] = arr.length;
            } else {
                nextres[i] = st.peek();

            }
            st.push(i);

        }

        st.clear();

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                prevres[i] = -1;
            } else {
                prevres[i] = st.peek();

            }
            st.push(i);

        }


       int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = nextres[i] - prevres[i] - 1;
            int area = arr[i] * width;
            max = Math.max(max, area);
        }

        return max;

    }
}