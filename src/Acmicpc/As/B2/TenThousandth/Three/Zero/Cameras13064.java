package Acmicpc.As.B2.TenThousandth.Three.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cameras13064 {
	static final int l = 8;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String str = null;
		boolean flag = true;
		
		while(n-- > 0) {
			str = br.readLine();
			flag = true;
			for (int i = 0; i < str.length() && flag; i++) {
				char c = str.charAt(i);
				if (i != l/2) {
					if (!(c >= '1' && c <= '9')) {
						flag = false;
					}
				}
				if (i == l/2) {
					if (!(c >= 'A' && c <= 'Z')) {
						flag = false;
					}
				}
				
			}
			if (flag && str.charAt(0) == str.charAt(1)) {
				sb.append(str).append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
