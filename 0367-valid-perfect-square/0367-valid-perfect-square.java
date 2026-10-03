class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;
        while(left <= right){
            long mid = left + (right-left)/2;
            long squares = mid*mid;
            if(squares == num){
                return true;
            }
            else if(squares > num){
               right = mid -1;
            }
            else{
              left = mid+1;
            }
        }
        return false;
    }
}