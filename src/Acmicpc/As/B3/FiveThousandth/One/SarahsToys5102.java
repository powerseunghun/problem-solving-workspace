package Acmicpc.As.B3.FiveThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SarahsToys5102 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int a0 = 0, a1 = 0, gap = 0;
		
		while (true) {
			tmp = br.readLine();
			a0 = Integer.parseInt(tmp.split(" ")[0]);
			a1 = Integer.parseInt(tmp.split(" ")[1]);
			if (a0 == 0 && a1 == 0) break;
			gap = Math.abs(a0-a1);
			if (gap < 2) sb.append("0 0\n");
			else if (gap % 2 != 0) sb.append((gap-3) / 2 + " " + 1 + "\n");
			else sb.append((gap/2) + " 0\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
