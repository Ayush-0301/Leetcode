class Solution {
    public int findLucky(int[] arr) {
        int []c = new int[501];
        for(int num : arr){
            c[num]++;
        }
        for(int i = 500 ;i>=1;i--){
            if(c[i] == i){
                return i;
            }
        }
        return -1;
    }
}