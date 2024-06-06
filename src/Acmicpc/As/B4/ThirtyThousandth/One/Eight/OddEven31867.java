package Acmicpc.As.B4.ThirtyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEven31867 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int odd = 0, even = 0;
		
		for (int i = 0, v = 0; i < str.length(); i++) {
			v = str.charAt(i)-'0';
			if (v%2 == 0) even++;
			else odd++;
		}
		
		System.out.println(even > odd ? "0" : even < odd ? "1" : "-1");
		br.close();
	}
}
