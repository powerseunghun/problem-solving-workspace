package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringParsing1661 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case ';':
				sb.append("\n"); break;
			case ',': 
				sb.append(" "); break;
			case ' ': continue;
			default: sb.append(str.charAt(i)); break;
				
			}
		}
		System.out.println(sb);
	}
}
