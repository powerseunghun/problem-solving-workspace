package Acmicpc.String.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAnalysis5586 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count1 = 0, count2 = 0;
		
		for (int i = 0; i < str.length()-2; i++) {
			if (str.charAt(i) == 'J' || str.charAt(i) == 'I') {
				if (str.charAt(i+1) == 'O' && str.charAt(i+2) == 'I') {
					if (str.charAt(i) == 'J') count1++;
					else  count2++;
				}
			}
		}
		System.out.println(count1);
		System.out.println(count2);
	}
}
