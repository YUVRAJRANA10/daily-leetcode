class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        while (n > 0) {
            int rem = n % 10;
            counts.put(rem, counts.getOrDefault(rem, 0) + 1);
            n = n / 10;
        }
        int sum = 0;
        for (int x : counts.keySet()) {
            int nn = counts.get(x);
            sum += x * nn;
        }
        return sum;
    }
}