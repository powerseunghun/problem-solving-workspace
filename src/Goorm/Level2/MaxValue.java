package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxValue {
	static int getMaxIdx(int[] arr, int max) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
		}
		
		System.out.println(max + " " + getMaxIdx(arr, max));
	}
}
