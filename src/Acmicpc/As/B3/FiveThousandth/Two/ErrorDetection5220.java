package Acmicpc.As.B3.FiveThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ErrorDetection5220 {
	static String check(String str, int c) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') cnt++;
		}
		return cnt % 2 == 0 ? c == 0 ? "Valid" : "Corrupt" : c == 0 ? "Corrupt" : "Valid"; 
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int t = Integer.parseInt(br.readLine()), n = 0, c = 0;
		
		while (t-- > 0) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			c = Integer.parseInt(tmp.split(" ")[1]);
			tmp = Integer.toBinaryString(n);
			sb.append(check(tmp, c) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
