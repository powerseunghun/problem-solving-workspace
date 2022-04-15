package Codeforce.OrderSubmit.OneHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int upperCount = 0, lowerCount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) upperCount++;
			else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) lowerCount++;
		}
		
		System.out.println(lowerCount >= upperCount ? str.toLowerCase() : str.toUpperCase());
		br.close();
	}
}
