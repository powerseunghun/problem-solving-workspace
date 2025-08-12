package Acmicpc.As.B3.EightThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Zwycięzcy8638 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), m = Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			m = Math.max(arr[i], m);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (m == arr[i]) {
				sb.append((char)(i+65));
			}
		}
		System.out.println(sb.toString());
		br.close();
	}
}
