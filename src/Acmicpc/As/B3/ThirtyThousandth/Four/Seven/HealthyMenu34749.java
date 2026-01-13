package Acmicpc.As.B3.ThirtyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HealthyMenu34749 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), res = 0;
		arr = new int[M];
		
		Arrays.fill(arr, 0);
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			for (int j = 0, v = 0; j < M; j++) {
				v = Integer.parseInt(str.split(" ")[j]);
				arr[j] = Math.max(arr[j], v);
			}
		}
		
		for (int el : arr) {
			res += el;
		}
		
		System.out.println(res);
		br.close();
	}
}
