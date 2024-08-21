package Acmicpc.As.B3.ThirtyThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColorBallon30156 {
	static int func(String str) {
		return Math.min(str.length()-str.replace("a", "").length(), str.length()-str.replace("b", "").length());
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			sb.append(func(br.readLine())).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
