package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOneOfBinary {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = Integer.toBinaryString(Integer.parseInt(br.readLine()));
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			count += str.charAt(i) == '1' ? 1 : 0;
		}
		
		System.out.println(count);
	}
}
