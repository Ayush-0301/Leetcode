class Solution {
    public int findDuplicate(int[] arr) {
      	int n = 1 + arr.length;
		int i = 0;
		while (i<arr.length) {
			if (arr[i] == i + 1 || arr[i] ==n)
				i++;
			else {
				int idx = arr[i]-1;
				swap(arr, i, idx);
				if(arr[i] == arr[idx]) return arr[i];
			}
		}
		return -1;
	}
	public static void swap(int[] a, int i, int idx) {
		int temp = a[i];
		a[i] = a[idx];
		a[idx] = temp;
	}
}