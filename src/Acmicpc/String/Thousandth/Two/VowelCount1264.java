package Acmicpc.String.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelCount1264 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int count = 0;
		
		while (true) {
			tmp = br.readLine();
			if (tmp.equals("#")) break;
			
			count = 0;
			for (int i = 0; i < tmp.length(); i++) {
				if (tmp.charAt(i) == 'a' || tmp.charAt(i) == 'e' || tmp.charAt(i) == 'i' || tmp.charAt(i) == 'o' || tmp.charAt(i) == 'u') {
					count++;
				}
				else if (tmp.charAt(i) == 'A' || tmp.charAt(i) == 'E' || tmp.charAt(i) == 'I' || tmp.charAt(i) == 'O' || tmp.charAt(i) == 'U') {
					count++;
				}
			}
			sb.append(count+"\n");
		}
		System.out.print(sb.toString());
	}
}
