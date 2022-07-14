package Acmicpc.As.B3.TenThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lateness10419 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), d = 0, l = 0;
		
		while(T-- > 0) {
			d = Integer.parseInt(br.readLine());
			l = 0;
			while (l + Math.pow(l, 2) < d) {
				l++;
			}
			if (l+Math.pow(l,2) == d) sb.append(l + "\n");
			else sb.append((l-1) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
