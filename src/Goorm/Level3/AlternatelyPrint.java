package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternatelyPrint {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
			if (i == j) sb.append(str.charAt(i));
			else {
				sb.append(str.charAt(i));
				sb.append(str.charAt(j));
			}
		}
		
		System.out.print(sb.toString());
	}
}
