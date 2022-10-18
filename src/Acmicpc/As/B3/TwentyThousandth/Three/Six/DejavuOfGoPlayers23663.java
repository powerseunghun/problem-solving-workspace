package Acmicpc.As.B3.TwentyThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DejavuOfGoPlayers23663 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0, m = 0;
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			m = Integer.parseInt(tmp.split(" ")[1]);
			if (n <= m) sb.append("Yes");
			else sb.append("No");
			br.readLine();
			br.readLine();
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
