class Solution {
    public int[] singleNumber(int[] nums) {
  HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        int[] r = new int[2];
        int i = 0;

        for (int num : set) {
            r[i] = num;
            i++;
        }

        return r;
    }

}