package Acmicpc.As.B2.NineThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerFlipping9313 {
	static final int l = 32;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long n = 0, res = 0;
		
		while(true) {
			n = Long.parseLong(br.readLine());
			if (n == -1) break;;
			res = 0;
			for (int i = 0; i < l; i++) {
				res = res << 1 | ((n & (1L << i)) >> i);
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
