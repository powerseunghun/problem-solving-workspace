package Acmicpc.As.B2.TwentyThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Строка21406 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			sb.append(sb.toString().contains(String.valueOf(i)) ? "" : i);
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
