class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int csum = 0;
            for(int j = i ;j<n;j++){
                csum += arr[j];
                if((j-i+1)%2 !=0){
                    sum+= csum;
                }
            }
           
        }
        return sum;
        
    }
}