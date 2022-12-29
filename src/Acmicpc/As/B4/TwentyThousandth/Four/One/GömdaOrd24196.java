package Acmicpc.As.B4.TwentyThousandth.Four.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GömdaOrd24196 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int w = 0;
		
		while (true) {
			sb.append(str.charAt(w));
			w += str.charAt(w)-64;
			if (w >= str.length()-1) {
				sb.append(str.charAt(str.length()-1));
				break;
			}
		}
		
		
		System.out.println(sb.toString());
		br.close();
	}
}
