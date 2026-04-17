package Acmicpc.As.B2.TenThousandth.Seven.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BallparkEstimate17795 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		if (str.length() == 1) {
			sb.append(str);
		} else if (str.charAt(1) >= '5') {
			sb.append(str.charAt(0)-'0'+1);
		} else {
			sb.append(str.charAt(0));
		}
		for (int i = 0; i < str.length()-1; i++) {
			sb.append(0);
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
