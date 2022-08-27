package Acmicpc.As.B3.EightThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dyslexia8387 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str1 = br.readLine();
		String str2 = br.readLine();
		int cnt = 0;
		
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(i)) cnt++;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
