package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SectionSum {
	static void makeCumulativeSum(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i] += arr[i-1];
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), s = 0, e = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		s = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		
		makeCumulativeSum(arr);
		System.out.println(arr[e] - arr[s-1]);
	}
}
