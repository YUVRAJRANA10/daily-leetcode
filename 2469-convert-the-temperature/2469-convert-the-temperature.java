class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];

        double kelvoin = 273.15 + celsius;
        double far = celsius * 1.80 + 32.00;
        ans[0] = kelvoin;
        ans[1] = far;
        return ans;
    }
}