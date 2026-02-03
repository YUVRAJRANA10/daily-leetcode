class Solution {
    public int removeDuplicates(int[] nums) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int a : nums) {

            set.add(a);
        }
        int count = 0;
        for (int a : set) {

            nums[count] = a;
            count++;

        }

        return count;

    }
}