package Acmicpc.As.B3.NineThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowMuch9325 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), s = 0, n = 0, q = 0, p = 0;
		String tmp = null;
		
		while (T-- > 0) {
			s = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				tmp = br.readLine();
				p = Integer.parseInt(tmp.split(" ")[0]);
				q = Integer.parseInt(tmp.split(" ")[1]);
				s += (p * q);
			}
			sb.append(s + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
