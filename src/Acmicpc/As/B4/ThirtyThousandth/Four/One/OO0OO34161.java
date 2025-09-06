package Acmicpc.As.B4.ThirtyThousandth.Four.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OO0OO34161 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			br.readLine();
		}
		for (int i = 0; i < 10000; i++) {
			sb.append(-1).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
