package Acmicpc.BruteForceAlgorithm.TenThousandth.Nine.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MathIsUntactLecture19532 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] exp = new int[6];
		for (int i = 0; i < exp.length; i++) {
			exp[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int x = -999; x <= 999; x++) {
			for (int y = -999; y <= 999; y++) {
				if ((exp[0] * x) + (exp[1] * y) == exp[2]) {
					if ((exp[3] * x) + (exp[4] * y) == exp[5]) {
						System.out.println(x + " " + y);
						return;
					}
				}
			}
		}
	}
}
