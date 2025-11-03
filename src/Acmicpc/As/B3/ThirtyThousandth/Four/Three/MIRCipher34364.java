package Acmicpc.As.B3.ThirtyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MIRCipher34364 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		str = str.split(" ")[1];
		
		for (int i = 0; i < N; i++) {
			long k = (1l << i) % 26;
			char c = str.charAt(i);
			while(k-- > 0) {
				c = (char)((c-'A'+1) % 26 + 'A');
			}
			sb.append(c);
		}
		System.out.println(sb.toString());
		br.close();
	}
}
