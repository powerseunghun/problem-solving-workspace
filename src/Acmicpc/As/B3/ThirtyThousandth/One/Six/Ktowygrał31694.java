package Acmicpc.As.B3.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ktowygrał31694 {
	static int[] arr1 = new int[11], arr2 = new int[11];
	static int sum1 = 0, sum2 = 0;
	static String check() {
		if (sum1 > sum2) {
			return "Algosia";
		} else if (sum2 > sum1) {
			return "Bajtek";
		}
		for (int i = 10; i > 0; i--) {
			if (arr1[i] != arr2[i]) {
				if (arr1[i] > arr2[i]) {
					return "Algosia";
				} else if (arr2[i] > arr1[i]) {
					return "Bajtek";
				}
			}
		}
		return "remis";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				int v = Integer.parseInt(st.nextToken());
				if (i == 0) {
					arr1[v]++;
					sum1 += v;
				} else {
					arr2[v]++;
					sum2 += v;
				}
			}
		}
		System.out.println(check());
		br.close();
	}
}
