package Acmicpc.MatheMatics.NineThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCDPairSum9613 {
	static long pairSum(int[] arr) {
		long sum = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				sum += GCD(arr[i], arr[j]);
			}
		}
		return sum;
	}
	static int GCD(int a, int b) {
		if (b % a == 0) return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[] arr = null;
		
		for (int i = 0, sum = 0; i < T; i++, sum = 0) {
			st = new StringTokenizer(br.readLine());
			arr = new int[Integer.parseInt(st.nextToken())];
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			sb.append(pairSum(arr)+"\n");
		}
		System.out.print(sb.toString());
	}
}
