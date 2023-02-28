package Acmicpc.As.B2.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RockPaperScissors4593 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp1 = null, tmp2 = null;
		char c1 = ' ', c2 = ' ';
		int p1 = 0, p2 = 0;
		
		while(true) {
			tmp1 = br.readLine();
			tmp2 = br.readLine();
			if (tmp1.equals("E") && tmp2.equals("E")) break;
			p1 = 0; p2 = 0;
			for (int i = 0; i < tmp1.length(); i++) {
				c1 = tmp1.charAt(i);
				c2 = tmp2.charAt(i);
				if (c1 == c2) continue;
				switch(c1) {
				case 'R':
					if (c2 == 'S') p1++;
					else p2++;
					break;
				case 'P':
					if (c2 == 'S') p2++;
					else p1++;
					break;
				case 'S':
					if (c2 == 'R') p2++;
					else p1++;
					break;
				}
			}
			sb.append("P1: " + p1).append("\n");
			sb.append("P2: " + p2).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
