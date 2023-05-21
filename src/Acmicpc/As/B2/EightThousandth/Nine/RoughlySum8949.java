package Acmicpc.As.B2.EightThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoughlySum8949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), format = null, fA = null, fB = null;;
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		format = "%0" + Math.max(String.valueOf(A).length(), String.valueOf(B).length()) + "d";
		fA = String.format(format, A);
		fB = String.format(format, B);
		
		for (int i = 0; i < fA.length(); i++) {
			sb.append((fA.charAt(i)-'0') + (fB.charAt(i)-'0'));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
