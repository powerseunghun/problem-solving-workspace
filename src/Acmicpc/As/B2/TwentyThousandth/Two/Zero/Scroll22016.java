package Acmicpc.As.B2.TwentyThousandth.Two.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scroll22016 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]);
		str = br.readLine();
		
		sb.append(str.substring(0, K-1));
		
		for (int i = K-1; i < str.length(); i++) {
			char c = str.charAt(i);
			sb.append((c >= 'a' && c <= 'z') ? (char)(c-32) : (char)(c+32));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
