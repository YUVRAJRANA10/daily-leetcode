class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>a = new ArrayList<>();
        int n = nums.length / 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // map.merge(nums[i], 1, Integer::sum);
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

            if (map.get(nums[i]) > n) {
                if(!a.contains(nums[i])){
                 a.add(nums[i]);}
            }

        }

        return a;





    }
}