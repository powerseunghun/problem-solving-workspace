package Acmicpc.As.B3.TwentyThousandth.Six.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeCupCombo26026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int res = 0, cf = 0;
		char c = ' ';
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			switch(c) {
			case '1':
				cf = 2;
				res++;
				break;
			case '0':
				if (cf > 0) {
					cf--;
					res++;
				}
				break;
			}
		}
		System.out.println(res);
		br.close();
	}
}
