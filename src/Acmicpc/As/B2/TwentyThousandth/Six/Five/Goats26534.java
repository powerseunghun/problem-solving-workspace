package Acmicpc.As.B2.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Goats26534 {
	static final int w = 6;
	static int[] arr1 = new int[w];
	static int[] arr2 = new int[w];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int cnt = 0, total = 0;
		for (int i = 0, idx = 0; i < 2; i++, idx = 0) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				if (i == 0) {
					arr1[idx++] = Integer.parseInt(st.nextToken());
				}
				else {
					arr2[idx++] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) continue;
				total++;
				if (arr1[i] > arr2[j]) cnt++;
			}
		}
		
		System.out.println(String.format("%.5f", cnt / (double)total));
		br.close();
		
	}
}
