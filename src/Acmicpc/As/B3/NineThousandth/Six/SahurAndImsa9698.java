package Acmicpc.As.B3.NineThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SahurAndImsa9698 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), h = 0, m = 0;
		String tmp = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			h = Integer.parseInt(tmp.split(" ")[0]);
			m = Integer.parseInt(tmp.split(" ")[1]);
			
			m -= 45;
			if (m < 0) {
				m += 60;
				h -= 1;
			}
			if (h < 0) h += 24;
			
			sb.append("Case #" + i + ": " + h + " " + m + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
