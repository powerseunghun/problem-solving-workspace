package Acmicpc.As.B2.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SexagenaryCycle7572 {
	static String a = "ABCDEFGHIJKL";
	static String b = "0123456789";
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(a.charAt((N+8)%12) + "" + b.charAt((N+6)%10));
		br.close();
	}
}
