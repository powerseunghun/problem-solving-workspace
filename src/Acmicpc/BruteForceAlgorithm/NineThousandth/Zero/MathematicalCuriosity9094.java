package Acmicpc.BruteForceAlgorithm.NineThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathematicalCuriosity9094 {
	static int check(int n, int m) {
		double value = 0, tmp1 = 0, tmp2 = 0;
		int count = 0;
		for (int a = 1; a < n; a++) {
			for (int b = a+1; b < n; b++) {
				tmp1 = (Math.pow(a, 2) + Math.pow(b, 2) + m);
				tmp2 = a * b;
				value = tmp1 / (double)tmp2;
				
				if (value == (int)value) count++;
			}
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), n = 0, m = 0;
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			m = Integer.parseInt(tmp.split(" ")[1]);
			sb.append(check(n, m) + "\n");
		}
		System.out.print(sb.toString());
	}
}
