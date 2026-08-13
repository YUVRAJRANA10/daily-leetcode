class Solution {
    public int largestRectangleArea(int[] arr) {
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