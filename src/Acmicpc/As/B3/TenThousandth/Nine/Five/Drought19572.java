package Acmicpc.As.B3.TenThousandth.Nine.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Drought19572 {
	static final int small = 3;
	static double[] arr = null;
	static String check(double a, double b, double c) {
		StringBuilder sb = new StringBuilder();
		if (a <= 0 || b <= 0 || c <= 0) {
			sb.append("-1");
			return sb.toString();
		}
		sb.append("1").append("\n");
		sb.append(String.format("%.1f %.1f %.1f", a, b, c)).append("\n");
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double a = 0, b = 0, c = 0, sum = 0;
		arr = new double[small];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			sum += arr[i];
		}
		a = (sum / 2) - arr[2];
		b = (sum / 2) - arr[1];
		c = (sum / 2) - arr[0];
		
		System.out.print(check(a, b, c));
		br.close();
	}
}
