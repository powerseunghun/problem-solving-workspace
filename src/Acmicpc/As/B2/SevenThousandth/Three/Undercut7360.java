package Acmicpc.As.B2.SevenThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Undercut7360 {
	static int[] arr1 = null, arr2 = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = 0;
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			arr1 = new int[n];
			arr2 = new int[n];
			for (int i = 0, idx = 0; i < 2; i++, idx = 0) {
				st = new StringTokenizer(br.readLine());
				while(st.hasMoreTokens()) {
					if (i == 0) {
						arr1[idx++] = Integer.parseInt(st.nextToken());
					} else {
						arr2[idx++] = Integer.parseInt(st.nextToken());
					}
				}
			}
			int sc1 = 0, sc2 = 0;
			for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
				if (arr1[i] > arr2[i]+1) {
					sc1 += arr1[i];
				} else if (arr1[i]+1 < arr2[i]) {
					sc2 += arr2[i];
				} else if (arr1[i] == arr2[i]+1) {
					sc2 += (arr2[i] == 1 ? 6 : arr1[i]+arr2[i]);
				} else if (arr1[i]+1 == arr2[i]) {
					sc1 += (arr1[i] == 1 ? 6 : arr1[i]+arr2[i]);
				}
			}
			sb.append("A has ").append(sc1).append(" points. B has ").append(sc2).append(" points.").append("\n\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
