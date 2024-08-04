package Acmicpc.As.B4.TwentyThousandth.Nine.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Короли29097 {
	static final int l = 3;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[l*2];
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < arr.length/2; i++) {
			max = Math.max(max, arr[i]*arr[i+l]);
		}
		for (int i = 0; i < arr.length/2; i++) {
			if (max == (arr[i]*arr[i+l])) {
				sb.append(i == 0 ? "Joffrey " : i == 1 ? "Robb " : "Stannis");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
