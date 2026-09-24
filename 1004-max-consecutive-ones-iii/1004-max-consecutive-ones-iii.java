class Solution {
    public int longestOnes(int[] arr, int k) {
        int left = 0;
        int zeros = 0;
        int maxlength = 0;
        for(int i = 0 ;i< arr.length;i++){
            if(arr[i] == 0){
                zeros++;
            }
            while(zeros > k){
                if(arr[left] == 0){
                    zeros--;
                }
                left++;
            }
            maxlength = Math.max(maxlength,i-left+1);
        }
        return maxlength;
    }
}