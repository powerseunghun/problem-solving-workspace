package Acmicpc.As.B2.TenThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseRot10347 {
	static final String key = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int n = 0;
		
		while(true) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[0]);
			if (n == 0) break;
			str = str.split(" ")[1];
			
			for (int i = str.length()-1, idx = 0; i >= 0; i--) {
				idx = (key.indexOf(str.charAt(i)) + n) % key.length();
				sb.append(key.charAt(idx));
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
