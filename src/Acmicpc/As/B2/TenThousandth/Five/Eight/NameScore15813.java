package Acmicpc.As.B2.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameScore15813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			res += str.charAt(i) - 64;
		}
		
		System.out.println(res);
		br.close();
	}
}
