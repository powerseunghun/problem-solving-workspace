package Acmicpc.As.B3.TwentyThousandth.Seven.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NoThanks27159 {
	static int[] arr = null;
	static int func() {
		int sum = 0, b = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (b == Integer.MAX_VALUE) {
				b = arr[i];
				continue;
			}
			if (Math.abs(arr[i]-arr[i-1]) == 1) {
				continue;
			}
			sum += b;
			b = Integer.MAX_VALUE;
			i--;
		}
		return sum + (b != Integer.MAX_VALUE ? b : 0);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(func());
		br.close();
	}
}