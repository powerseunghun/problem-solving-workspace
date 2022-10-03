package Acmicpc.As.B4.TwentyThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointerStudy25703 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		sb.append("int a;\n");
		sb.append("int *ptr = &a;\n");
		
		for (int i = 2; i <= N; i++) {
			sb.append("int ");
			for (int j = 1; j <= i; j++) {
				sb.append("*");
			}
			sb.append("ptr" + i + " = " + "&ptr" + ((i-1) >= 2 ? (i-1) : ""));
			sb.append(";\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
