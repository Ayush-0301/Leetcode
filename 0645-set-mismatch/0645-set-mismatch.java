class Solution {
    public int[] findErrorNums(int[] nums) {
       int [] ans = new int[2];
       ans[0] = duplicate(nums);
       ans[1] = remove(nums);
       return ans;
        
    }
    public static int duplicate(int [] arr){
        int n = 1 + arr.length;
        int i = 0;
        while(i< arr.length){
            if(arr[i] == i +1 || arr[i] == n) i++;
            else {
                int idx = arr[i]-1;
                swap(arr,i,idx);
                if(arr[i] == arr[idx]){
                    return arr[i];
                }

            }
        }
        return -1;
    }
    public static int remove(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i<n){
            int rightindex = arr[i] -1 ;
            if(arr[i] == i+1 || arr[rightindex] == arr[i]) i++;
            else swap(arr,i,rightindex);
        }
        for(i = 0;i<n;i++){
            if(arr[i] != i+1) return i+1;
        }
        return n;

    }
    public static void swap(int[] a,int i,int idx){
        int temp = a[i];
        a[i] = a[idx];
        a[idx] = temp;
    }
    }
