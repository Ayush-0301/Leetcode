class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        List<Integer> lt = new ArrayList<>(set);
        lt.sort(Collections.reverseOrder());
        if (lt.size() < 3) {
            return lt.get(0); // Return maximum if third max doesn't exist
        }
        return lt.get(2);
    }

}