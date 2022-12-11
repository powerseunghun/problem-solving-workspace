package Acmicpc.As.B2.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DNA1672 {
	static String func(String str) {
		char c1 = str.charAt(str.length()-1);
		char c2 = str.charAt(str.length()-2);
		char c3 = ' ';
		if (c1 == c2) {
			c3 = c1;
		}
		else {
			switch(c1) {
			case 'A':
				c3 = c2 == 'G' ? 'C': c2 == 'C' ? 'A' : 'G';
				break;
			case 'G':
				c3 = c2 == 'A' ? 'C': c2 == 'C' ? 'T' : 'A';
				break;
			case 'C':
				c3 = c2 == 'A' ? 'A': c2 == 'G' ? 'T' : 'G';
				break;
			case 'T':
				c3 = c2 == 'A' ? 'G': c2 == 'G' ? 'A' : 'G';
				break;
			}
		}
		return (str.substring(0, str.length()-2) + c3);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		
		while(str.length() != 1) {
			str = func(str);
		}
		
		System.out.println(str);
		br.close();
	}
}
