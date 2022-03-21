package Acmicpc.OrderSubmit.TenThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongestIncreasingSubsequence12738 {
	static int[] arr = null, lis = null;
	static int getIndexBinarySearch(int left, int right, int val) {
		int mid = 0; 
		while (left < right) {
			mid = (left+right)/2;
			if (lis[mid] < val) {
				left = mid+1;
			}
			else right = mid;
		}
		return right;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), idx = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		lis = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i == 0) {
				lis[idx++] = arr[i];
			}
			else {
				if (lis[idx-1] < arr[i]) {
					lis[idx++] = arr[i];
				}
				else lis[getIndexBinarySearch(0, idx-1, arr[i])] = arr[i];
			}
		}
		System.out.println(idx);
		br.close();
	}
}
