package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch {
	static int binarySearch(int[] arr, int target) {
		int l = 0, r = arr.length-1, mid = 0;
		while (l <= r) {
			mid = (l+r) / 2;
			if (arr[mid] == target) {
				return mid+1;
			}
			else if (arr[mid] > target) {
				r = mid-1;
			}
			else l = mid+1;
		}
		return Integer.MIN_VALUE;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int target = Integer.parseInt(br.readLine()), res = 0;
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		res = binarySearch(arr, target);
		System.out.println(res == Integer.MIN_VALUE ? "X" : res);
	}
}
