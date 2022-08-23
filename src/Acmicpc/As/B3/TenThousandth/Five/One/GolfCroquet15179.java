package Acmicpc.As.B3.TenThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GolfCroquet15179 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String team1 = br.readLine(), team2 = br.readLine();
		int sc1 = 0, sc2 = 0;
		char t = ' ';
		br.readLine();
		String tmp = br.readLine();
		
		for (int i = 0, sc = 0; i < tmp.length(); i++) {
			t = tmp.charAt(i);
			if (t == 'S') continue;
			sc = t == 'D' ? 2 : 1;
			
			// H, D, O
			if (i % 4 == 0 || i % 4 == 2) {
				if (t == 'O') {
					sc2 += sc;
				}
				else sc1 += sc;
			}
			else {
				if (t == 'O') {
					sc1 += sc;
				}
				else sc2 += sc;
			}
			if (sc1 >= 7 || sc2 >= 7) {
				sc1 = sc1 >= 7 ? 7 : sc1;
				sc2 = sc2 >= 7 ? 7 : sc2;
				break;
			}
		}
		sb.append(team1 + " " + sc1 + " " + team2 + " " + sc2 + ". ");
		if (sc1 == sc2) {
			sb.append("All square.\n");
		}
		else {
			sb.append((sc1 > sc2 ? team1 : team2) + " " + ((sc1 >= 7 || sc2 >= 7) ? "has won.\n" : "is winning.\n"));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
