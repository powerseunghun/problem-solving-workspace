package Acmicpc.As.B3.FiveThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sequences5101 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		long a = 0, d = 0, n = 0, diff = 0;
		
		while (true) {
			tmp = br.readLine();
			a = Long.parseLong(tmp.split(" ")[0]);
			d = Long.parseLong(tmp.split(" ")[1]);
			n = Long.parseLong(tmp.split(" ")[2]);
			if (a == 0 && d == 0 && n == 0) break;
			
			diff = n - a;
			if (diff % d != 0) {
				sb.append("X\n");
				continue;
			}
			if (a > n && d > 0) {
				sb.append("X\n");
				continue;
			}
			
			sb.append((diff/d+1) + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
