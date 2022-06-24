package Acmicpc.As.B3.EightThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Heptathlon8932 {
	static double[][] scores = {
			{9.23076, 26.7, 1.835},
			{1.84523, 75, 1.348},
			{56.0211, 1.5, 1.05},
			{4.99087, 42.5, 1.81},
			{0.188807, 210, 1.41},
			{15.9803, 3.8, 1.04},
			{0.11193, 254, 1.88}};
	static int[] flag = {0, 1, 1, 0, 1, 1, 0};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), res = 0;
		double A = 0, B = 0, C = 0;
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			res = 0;
			for (int i = 0, val = 0; i < flag.length; i++) {
				A = scores[i][0];
				B = scores[i][1];
				C = scores[i][2];
				val = Integer.parseInt(tmp.split(" ")[i]);
				res += flag[i] == 0 ? Math.floor(A*Math.pow((B-val), C)) : Math.floor(A*Math.pow((val-B), C));
			}
			sb.append(res + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
