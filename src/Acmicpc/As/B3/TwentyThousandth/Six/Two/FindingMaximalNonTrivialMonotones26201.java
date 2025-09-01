package Acmicpc.As.B3.TwentyThousandth.Six.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindingMaximalNonTrivialMonotones26201 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0, c = 1;
		String str = br.readLine();
		
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i-1)) {
				c++;
			} else {
				if (str.charAt(i-1) == 'a' && c > 1) {
					res += c;
				}
				c = 1;
			}
		}
		if (str.charAt(str.length()-1) == 'a' && c > 1) {
			res += c;
		}
		
		System.out.println(res);
		br.close();
	}
}
