package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASCIIEncoding1408 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(), sb2 = new StringBuilder();
		String pw = br.readLine();
		
		for (int i = 0; i < pw.length(); i++) {
			sb.append((char)(pw.charAt(i) + 2));
			sb2.append((char)(pw.charAt(i) * 7 % 80 + 48));
		}
		
		System.out.println(sb);
		System.out.println(sb2);
	}
}
