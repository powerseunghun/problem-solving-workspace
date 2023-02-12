package Acmicpc.As.B2.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VigenèreCipherEncryption3417 {
	static String func(String K, String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0, idx = 0, w = 0, r = 0; i < str.length(); i++) {
			w = (int)(K.charAt(idx++)-64);
			r = (int)(str.charAt(i)+w);
			r = r > 90 ? r - 26 : r;
			sb.append((char)r);
			idx %= K.length();
		}
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		String K = null, str = null;
		
		while (true) {
			K = br.readLine();
			if (K.equals("0")) break;
			str = br.readLine();
			sb.append(func(K, str) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
