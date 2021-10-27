package Goorm.Level2;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class MakeSubString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.subSequence(0, i+1));
			if (i != str.length()-1) sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
