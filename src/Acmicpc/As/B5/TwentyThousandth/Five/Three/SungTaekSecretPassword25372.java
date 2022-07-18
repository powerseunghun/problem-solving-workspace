package Acmicpc.As.B5.TwentyThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SungTaekSecretPassword25372 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String pw = null;
		
		while (N-- > 0) {
			pw = br.readLine();
			if (pw.length() >= 6 && pw.length() <= 9) sb.append("yes\n");
			else sb.append("no\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
