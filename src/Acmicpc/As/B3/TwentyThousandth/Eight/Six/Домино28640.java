package Acmicpc.As.B3.TwentyThousandth.Eight.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Домино28640 {
	static boolean func(int a1, int b1, int a2, int b2) {
		return a1==b1 || a1==b2 || a2==b1 || a2==b2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int a1 = str1.indexOf('|');
		int b1 = str2.indexOf('|');
		int a2 = str1.length()-a1-1;
		int b2 = str2.length()-b1-1;
		
		System.out.println(func(a1, b1, a2, b2) ? "Yes" : "No");
		br.close();
	}
}
