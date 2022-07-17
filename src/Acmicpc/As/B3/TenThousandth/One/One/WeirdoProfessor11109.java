package Acmicpc.As.B3.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdoProfessor11109 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), d = 0, n = 0, s = 0, p = 0;
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			d = Integer.parseInt(tmp.split(" ")[0]);
			n = Integer.parseInt(tmp.split(" ")[1]);
			s = Integer.parseInt(tmp.split(" ")[2]);
			p = Integer.parseInt(tmp.split(" ")[3]);
			
			if (d+n*p > n*s) {
				sb.append("do not parallelize\n");
			}
			else if (d+n*p < n*s) {
				sb.append("parallelize\n");
			}
			else sb.append("does not matter\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
