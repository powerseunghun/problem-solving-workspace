package Acmicpc.As.B4.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Grade30008 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.split(" ")[0]), v = 0;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			v *= 100;
			v /= N;
			if (v <= 4) {
				sb.append("1 ");
			} else if (v <= 11) {
				sb.append("2 ");
			} else if (v <= 23) {
				sb.append("3 ");
			} else if (v <= 40) {
				sb.append("4 ");
			} else if (v <= 60) {
				sb.append("5 ");
			} else if (v <= 77) {
				sb.append("6 ");
			} else if (v <= 89) {
				sb.append("7 ");
			} else if (v <= 96) {
				sb.append("8 ");
			} else if (v <= 100) {
				sb.append("9 ");
			}
		}
		System.out.println(sb.toString());
		br.close();
	}
}
