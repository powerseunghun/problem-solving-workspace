package Acmicpc.As.B4.TwentyThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChinoShock27310 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = str.length();
		int b = str.length() - str.replaceAll(":", "").length();
		int c = str.length() - str.replaceAll("_", "").length();
		
		System.out.println(a + b + c * 5);
		br.close();
	}
}
