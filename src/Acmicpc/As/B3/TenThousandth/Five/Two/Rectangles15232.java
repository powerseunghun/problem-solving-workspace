package Acmicpc.As.B3.TenThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangles15232 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int R = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
