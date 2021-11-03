package test;

public class P3 {
	public static void main(String[] args) {
		int[] arr = {6, 5, 7, 3, 4, 2};
		int l = 0, r = arr.length-1, max = Integer.MIN_VALUE;
		int w = 0, h = 0;
		
		// bSearch
		while (l < r) {
			w = Math.abs(l-r)-1;
			h = Math.min(arr[l], arr[r]);
			max = Math.max(w*h, max);
			
			if (arr[l] <= arr[r]) l++;
			else r--;
		}
		
		System.out.println(max);
	}
}
