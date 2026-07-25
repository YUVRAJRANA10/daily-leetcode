class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // map.merge(nums[i], 1, Integer::sum);
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

            if (map.get(nums[i]) > n) {
                return nums[i];
            }

        }

        return -1;

    }
}