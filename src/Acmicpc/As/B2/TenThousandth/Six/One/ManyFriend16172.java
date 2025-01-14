package Acmicpc.As.B2.TenThousandth.Six.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManyFriend16172 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		String str = br.readLine().replaceAll("[0-9]", "");
		String str = br.readLine();
		String K = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') continue;
			sb.append(c);
		}
		
		System.out.println(sb.toString().contains(K) ? "1" : "0");
		br.close();
	}
}
