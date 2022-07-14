package Acmicpc.As.B3.TenThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoYouLikeFraction10474 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int d = 0, n = 0;
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			d = Integer.parseInt(tmp.split(" ")[0]);
			n = Integer.parseInt(tmp.split(" ")[1]);
			
			if (d == 0 && n == 0) break;
			sb.append((d/n) + " " + (d%n) + " / " + n + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
