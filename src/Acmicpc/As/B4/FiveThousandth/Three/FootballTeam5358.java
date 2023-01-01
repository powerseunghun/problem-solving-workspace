package Acmicpc.As.B4.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FootballTeam5358 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		char c = ' ';
		
		while ((str = br.readLine()) != null) {
			for (int i = 0; i < str.length(); i++) {
				c = str.charAt(i);
				switch(c) {
				case 'i':
					c = 'e';
					break;
				case 'e':
					c = 'i';
					break;
				case 'I':
					c = 'E';
					break;
				case 'E':
					c = 'I';
					break;
				}
				sb.append(c);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
