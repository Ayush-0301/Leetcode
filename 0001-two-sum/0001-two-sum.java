class Solution {
    public int[] twoSum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        boolean found = false;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = k - arr[i];

            if (map.containsKey(sum)) {
                ans[0] = map.get(sum);
                ans[1] = i;
                found = true;
                break;

            }
            map.put(arr[i], i);
        }
        if (found) {
            return ans;
        }
        return new int[]{-1,-1};
    }
}