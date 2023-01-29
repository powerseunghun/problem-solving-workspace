package Acmicpc.As.B2.EightThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySum8741 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < K; i++) {
			sb.append("1");
		}
		for (int i = 0; i < K-1; i++) {
			sb.append("0");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
