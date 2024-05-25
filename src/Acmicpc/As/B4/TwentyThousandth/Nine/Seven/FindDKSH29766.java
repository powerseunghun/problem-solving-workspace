package Acmicpc.As.B4.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDKSH29766 {
	static final String t = "DKSH";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println((str.length() - str.replaceAll(t, "").length()) / t.length());
		br.close();
	}
}
