package Acmicpc.As.B2.TwentyThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rotation23813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			str = str.substring(str.length()-1, str.length()) + str.substring(0, str.length()-1);
			res += Long.parseLong(str);
		}
		
		System.out.println(res);
		br.close();
	}
}
