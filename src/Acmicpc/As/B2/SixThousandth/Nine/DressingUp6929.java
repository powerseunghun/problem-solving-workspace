package Acmicpc.As.B2.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DressingUp6929 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), sp = N*2-2, v = 1;
		
		for (int i = 0; i < N/2+1; i++) {
			for (int j = 0; j < v; j++) {
				sb.append("*");
			}
			for (int j = 0; j < sp; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < v; j++) {
				sb.append("*");
			}
			v += 2;
			sp -= 4;
			sb.append("\n");
		}
		v -= 4;
		sp += 8;
		for (int i = 0; i < N/2; i++) {
			for (int j = 0; j < v; j++) {
				sb.append("*");
			}
			for (int j = 0; j < sp; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < v; j++) {
				sb.append("*");
			}
			v -= 2;
			sp += 4;
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
