class Solution {
    static int count;
    public  static void inversion(int [] a,int[] b){
        int i = 0,j= 0;
        while(i<a.length && j<b.length){
            if((long)a[i] > ((long)2*(long)b[j])){
                count += (a.length-i);
                j++;
            }
            else i++;
        }
    }

    public int reversePairs(int[] arr) {
     count = 0;
     mergeSort(arr);
     return count;

    }
     private static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n==1) return;
        int [] a = new int[n/2];
        int [] b = new int[n-n/2];
        int idx = 0;
        // idx travel karegaa arr pe
        for(int i = 0;i<a.length;i++){
            a[i] = arr[idx++];
        }
        for(int i = 0;i<b.length;i++){
            b[i] = arr[idx++];
        }
            mergeSort(a);
            mergeSort(b);
            inversion(a,b);
            merge(a,b,arr);



    }

    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else {
                // if(a[i] >=  2*b[j])
                // count += (a.length-i);
                c[k++] = b[j++];
        }}
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}