package Acmicpc.As.B2.TenThousandth.Three.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SweetAndSourPork13419 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			String a = "", b = "";
			for (int i = 0; i < str.length(); i++) {
				if (i % 2 != 0) a += str.charAt(i);
				else b += str.charAt(i);
			}
			if (str.length() % 2 != 0) {
				sb.append(b).append(a).append("\n").append(a).append(b).append("\n");
			} else {
				sb.append(b).append("\n").append(a).append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
