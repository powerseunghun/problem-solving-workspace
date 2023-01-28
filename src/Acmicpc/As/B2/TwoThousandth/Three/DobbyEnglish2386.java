package Acmicpc.As.B2.TwoThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DobbyEnglish2386 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null, format = null;
		char c = ' ';
		
		while(true) {
			tmp = br.readLine();
			c = tmp.split(" ")[0].charAt(0);
			if (c == '#') break;
			tmp = tmp.substring(tmp.indexOf(' ')+1, tmp.length());
			format = (c >= 'a' && c <='z') ? (char)c + "|" + ((char)(c-32)) : (char)c + "|" + ((char)(c+32));
			sb.append(c + " " + Math.abs(tmp.length()-tmp.replaceAll(format, "").length()) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
