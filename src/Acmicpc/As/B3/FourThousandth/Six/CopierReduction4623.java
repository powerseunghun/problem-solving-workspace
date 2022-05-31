package Acmicpc.As.B3.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopierReduction4623 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int A = 0, B = 0, C = 0, D = 0, l = 0, r = 0, m = 0, res = 0;
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			C = Integer.parseInt(tmp.split(" ")[2]);
			D = Integer.parseInt(tmp.split(" ")[3]);
			if (A == 0 && B == 0 && C == 0 && D == 0) break;
			
			l = 0;
			r = 100;
			m = 0;
			
			while (l <= r) {
				m = (l+r) / 2;
				if (Math.min(A, B) * m <= 100 * Math.min(C, D) && Math.max(A, B) * m <= 100 * Math.max(C, D)) {
					l = m+1;
					res = m;
				}
				else r = m-1;
			}
			sb.append(res + "%\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
