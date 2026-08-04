class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean []num =  new boolean[101];
        for(int n : nums){
            min = Math.min(min,n);
            max = Math.max(max,n);
            num[n] = true;
        }
        List<Integer> miss = new ArrayList<>();
        for(int i = min ;i<= max;i++){
            if(!num[i]){
                miss.add(i);
            }
        }
        return miss;
    }
}