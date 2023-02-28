package Acmicpc.As.B2.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSum4613 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		char c = ' ';
		int sum = 0;
		
		while(true) {
			tmp = br.readLine();
			if (tmp.equals("#")) break;
			sum = 0;
			for (int i = 0; i < tmp.length(); i++) {
				c = tmp.charAt(i);
				sum += (c == ' ' ? 0 : c-64) * (i+1);
			}
			sb.append(sum).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
