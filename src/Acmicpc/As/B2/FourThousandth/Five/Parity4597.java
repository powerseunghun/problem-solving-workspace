package Acmicpc.As.B2.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parity4597 {
	static String func(String tmp, char c) {
		int cnt = tmp.length()-tmp.replaceAll("1", "").length();
		char rc = ' ';
		switch(c) {
		case 'e':
			rc = cnt%2 == 0 ? '0' : '1';
			break;
		case 'o':
			rc = cnt%2 == 0 ? '1' : '0';
			break;
		}
		return tmp.substring(0, tmp.length()-1) + rc;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		char c = ' ';
		
		while(true) {
			tmp = br.readLine();
			if (tmp.equals("#")) break;
			c = tmp.charAt(tmp.length()-1);
			sb.append(func(tmp, c)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
