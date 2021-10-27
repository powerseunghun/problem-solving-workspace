package Goorm.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UpperLowerChange {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String printStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				printStr += (char)(str.charAt(i)-32);
			}
			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				printStr += (char)(str.charAt(i)+32);
			}
			else printStr += str.charAt(i);
		}
		System.out.println(printStr);
	}
}
