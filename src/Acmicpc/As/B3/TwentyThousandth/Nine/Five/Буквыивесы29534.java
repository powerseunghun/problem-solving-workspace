package Acmicpc.As.B3.TwentyThousandth.Nine.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Буквыивесы29534 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), res = 0;
		String str = br.readLine();
		
		if (str.length() > n) {
			System.out.println("Impossible");
		} else {
			for (int i = 0; i < str.length(); i++) {
				res += str.charAt(i)-96;
			}
			System.out.println(res);
		}
		
		br.close();
	}
}
