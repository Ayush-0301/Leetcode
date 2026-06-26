class Solution {
    public static void swap(int[] a,int i,int idx){
        int temp = a[i];
        a[i] = a[idx];
        a[idx] = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;//index hoga 0 to n
        while(i<n){
            
            if(nums[i] <= 0 || nums[i]>n || nums[i] == i+1 || nums[i] == nums[nums[i] -1] ) i++;
            else swap(nums,i,nums[i]-1);
        }
        for( i = 0;i<n;i++){
            if(nums[i] != i+1) return i+1;
        }
        return n+1;
    }
}