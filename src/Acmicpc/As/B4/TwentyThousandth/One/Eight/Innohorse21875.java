package Acmicpc.As.B4.TwentyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Innohorse21875 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int g1 = Math.abs(str1.charAt(0)-str2.charAt(0));
		int g2 = Math.abs(str1.charAt(1)-str2.charAt(1));
		
		System.out.println(Math.min(g1, g2) + " " + Math.max(g1, g2));
		br.close();
	}
}
