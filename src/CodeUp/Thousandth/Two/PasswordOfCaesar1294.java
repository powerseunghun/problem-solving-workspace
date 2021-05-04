package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordOfCaesar1294 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) == ' ') {
				sb.append(" ");
			}
			else {
				char c = tmp.charAt(i) + 3 > 122 ? (char)(tmp.charAt(i) + 3 - 26) : (char)(tmp.charAt(i) + 3);
				sb.append(c);
			}
		}
		
		System.out.println(sb);
	}
}
