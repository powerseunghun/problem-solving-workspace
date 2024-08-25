package Acmicpc.As.B3.ThirtyThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JustAJoystick30314 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		for (int i = 0, v = 0; i < str1.length(); i++) {
			v = Math.abs(str1.charAt(i)-str2.charAt(i));
			res += Math.min(v, 26-v);
		}
		
		System.out.println(res);
		br.close();
	}
}
