package Acmicpc.As.B5.TwentyThousandth.Nine.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WelcomeToSMUPC29699 {
	static final String str = "WelcomeToSMUPC";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 0, res = 0;
		for (int i = 1; i <= str.length(); i++) {
			res = (i%14)-1;
			res = res == -1 ? res = str.length()-1 : res;
			System.out.println(str.charAt(res));
		}
//		System.out.println(str.charAt(res < 0 ? str.length()-1 : res-1));
		br.close();
	}
}
