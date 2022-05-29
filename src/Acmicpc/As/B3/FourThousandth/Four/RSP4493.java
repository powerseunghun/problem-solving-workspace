package Acmicpc.As.B3.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RSP4493 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0, w1 = 0, w2 = 0;
		char p1 = ' ', p2 = ' ';
		String tmp = null;
		
		while (T-- > 0) {
			n = Integer.parseInt(br.readLine());
			w1 = 0;
			w2 = 0;
			for (int i = 0; i < n; i++) {
				tmp = br.readLine();
				p1 = tmp.split(" ")[0].charAt(0);
				p2 = tmp.split(" ")[1].charAt(0);
				if (p1 == 'R') {
					if (p2 == 'S') w1++;
					else if (p2 == 'P') w2++;
				}
				else if (p1 == 'S') {
					if (p2 == 'R') w2++;
					else if (p2 == 'P') w1++;
				}
				else {
					if (p2 == 'R') w1++;
					else if (p2 == 'S') w2++;
				}
			}
			if (w1 == w2) sb.append("TIE\n");
			else sb.append(w1 > w2 ? "Player 1\n" : "Player 2\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
