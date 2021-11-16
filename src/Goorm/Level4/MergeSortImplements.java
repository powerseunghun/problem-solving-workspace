package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MergeSortImplements {
	static int[] sortArr = null;
	static void mergeProcess(int[] arr, int l, int m, int r) {
		int lIdx = l, rIdx = m+1, sortIdx = l;
		
		while (lIdx <= m && rIdx <= r) {
			if (arr[lIdx] <= arr[rIdx]) sortArr[sortIdx++] = arr[lIdx++];
			else sortArr[sortIdx++] = arr[rIdx++];
		}
		
		if (lIdx > m) {
			for (int i = rIdx; i <= r; i++) {
				sortArr[sortIdx++] = arr[i];
			}
		}
		else {
			for (int i = lIdx; i <= m; i++) {
				sortArr[sortIdx++] = arr[i];
			}
		}
		for (int i = l; i <= r; i++) {
			arr[i] = sortArr[i];
		}
	}
	static void mergeSort(int[] arr, int l, int r) {
		int mid = 0;
		if (l < r) {
			mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			mergeProcess(arr, l, mid, r);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N]; 
		sortArr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		mergeSort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		br.close();
	}
}
