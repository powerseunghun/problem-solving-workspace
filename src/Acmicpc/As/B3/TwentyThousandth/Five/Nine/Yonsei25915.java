package Acmicpc.As.B3.TwentyThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yonsei25915 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "ILOVEYONSEI";
		char c = br.readLine().charAt(0);
		int res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			res += Math.abs((int)c - (int)str.charAt(i));
			c = str.charAt(i);
		}
		
		System.out.println(res);
		br.close();
		
	}
}
