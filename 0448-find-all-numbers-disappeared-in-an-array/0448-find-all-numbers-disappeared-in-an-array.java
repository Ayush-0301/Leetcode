class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
         ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while(i<n){
            int rightindex = arr[i] -1 ;
            if(arr[i] == i+1 || arr[rightindex] == arr[i]) i++;
            else swap(arr,i,rightindex);
        }
        for(i = 0;i<n;i++){
            if(arr[i] != i+1) ans.add(i+1);
        }
        return ans;
    }
    public static void swap(int[] a,int i,int idx){
        int temp = a[i];
        a[i] = a[idx];
        a[idx] = temp;
    }
    }
