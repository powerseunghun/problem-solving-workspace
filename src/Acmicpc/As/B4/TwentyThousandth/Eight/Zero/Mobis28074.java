package Acmicpc.As.B4.TwentyThousandth.Eight.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mobis28074 {
	static final String cmp = "MOBIS";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		boolean flag = true;
		
		for (int i = 0; i < cmp.length(); i++) {
			if (!str.contains(cmp.charAt(i)+"")) {
				flag = false;
			}
		}
		
		System.out.println(flag ? "YES" : "NO");
		br.close();
	}
}
