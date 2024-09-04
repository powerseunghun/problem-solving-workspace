package Acmicpc.As.B3.ThirtyThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BetterDice30306 {
	static final int l = 2;
	static void arrInit(long[] arr, StringTokenizer st) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), w1 = 0;
		long[] arr1 = new long[n];
		long[] arr2 = new long[n];
		
		for (int i = 0; i < l; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			if (i == 0) {
				arrInit(arr1, st);
			} else {
				arrInit(arr2, st);
			}
		}
		
		for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
			for (int j = 0; j < Math.min(arr1.length, arr2.length); j++) {
				if (arr1[i] > arr2[j]) w1++;
				if (arr1[i] < arr2[j]) w1--;
			}
		}
		
		System.out.println(w1 == 0 ? "tie" : w1 > 0 ? "first" : "second");
		br.close();
	}
}
