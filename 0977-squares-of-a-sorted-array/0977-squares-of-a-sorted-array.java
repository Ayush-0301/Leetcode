class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int []result = new int[n];
        for(int k = n-1; k>= 0;k--){
            int lsqre = nums[i]*nums[i];
            int rsqre = nums[j]*nums[j];

            if(lsqre > rsqre){
                result[k] = lsqre;
                i++;
            }
            else{
                result[k] = rsqre;
                j--;
            }
        }
        return result;
    }
}