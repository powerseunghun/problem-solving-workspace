package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SlapMatchGame {
	static String check(int[] aCount, int[] bCount) {
		for (int i = aCount.length-1; i >= 0; i--) {
			if (aCount[i] != bCount[i]) {
				if (aCount[i] > bCount[i]) return "A";
				else return "B";
			}
		}
		return "D";
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		int[] aCount = new int[4], bCount = new int[4];
		
		for (int i = 0; i < N; i++) {
			Arrays.fill(aCount, 0);
			Arrays.fill(bCount, 0);
			for (int j = 0, val = 0; j < 2; j++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				while (st.hasMoreTokens()) {
					val = Integer.parseInt(st.nextToken());
					switch(j) {
					case 0:
						aCount[val-1]++;
						break;
					case 1:
						bCount[val-1]++;
						break;
					}
				}
			}
			sb.append(check(aCount, bCount) + "\n");
		}
		System.out.print(sb.toString());
	}
}
