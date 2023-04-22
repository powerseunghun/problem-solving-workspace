package Acmicpc.As.B3.TenThousandth.Nine.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Drought19572 {
	static final int small = 3;
	static int[] arr = null;
	static String check(double a, double b, double c) {
		StringBuilder sb = new StringBuilder();
		if (a <= 0 || b <= 0 || c <= 0) {
			sb.append("-1");
			return sb.toString();
		}
		sb.append("1").append("\n");
		sb.append(String.format("%.1f, %.1f, %.1f", a, b, c)).append("\n");
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double a = 0, b = 0, c = 0;
		arr = new int[small];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		b = arr[0]-arr[1]+arr[2];
		b /= 2.0;
		a = Math.abs(arr[0]-b);
		c = Math.abs(arr[2]-b);
		
		System.out.println(check(a, b, c));
		br.close();
	}
}
