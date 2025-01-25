package Acmicpc.As.B2.TenThousandth.One.Zero;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SimonSays11094 {
	static final String t = "Simon says";
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			if (str.contains(t)) {
				sb.append(str.substring(str.indexOf(t)+t.length(), str.length())).append("\n");
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
