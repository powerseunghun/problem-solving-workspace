package Acmicpc.Step20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberCardTwo10816 {
	// lower_bound, upper_bound implements q
	public static int lower(int[] arr, int target) {
		int left = 0, right = arr.length-1, mid = 0;
		
		while (left < right) {
			mid = (left + right) / 2;
			if (arr[mid] >= target) {
				right = mid;
			}
			else {
				left = mid + 1;
			}
		}
		return right;
	}
	
	public static int upper(int[] arr, int target) {
		int left = 0, right = arr.length-1, mid = 0;
		
		while(left < right) {
			mid = (left + right) / 2;
			if (arr[mid] > target) {
				right = mid;
			}
			else {
				left = mid + 1;
			}
		}
		// tc1 target = 10. 상한 처리
		if (arr[right] == target) right++;
		return right;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// StringBuilder 없이 반복문에서 sysout = timelimit 1s
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), M = 0;
		int lower = 0, upper = 0;
		String[] tmp = br.readLine().split(" ");
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(tmp[i]);
		}
		Arrays.sort(arr);
		
		M = Integer.parseInt(br.readLine());
		tmp = br.readLine().split(" ");
		
		for (int i = 0; i < M; i++) {
			lower = lower(arr, Integer.parseInt(tmp[i]));
			upper = upper(arr, Integer.parseInt(tmp[i]));
			sb.append((upper - lower) + " ");
		}
		
		System.out.println(sb);
	}
}
