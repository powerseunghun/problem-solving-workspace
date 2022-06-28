package Acmicpc.As.B4.TenThousandth.Eight.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasketballOneOnOne18198 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sumA = 0, sumB = 0;
		
		for (int i = 1; i < str.length(); i+=2) {
			if (str.charAt(i-1) == 'A') sumA += str.charAt(i)-'0';
			else sumB += str.charAt(i)-'0';
		}
		
		System.out.println(sumA > sumB ? "A" : "B");
		br.close();
	}
}
