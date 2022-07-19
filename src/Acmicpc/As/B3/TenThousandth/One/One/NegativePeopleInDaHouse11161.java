package Acmicpc.As.B3.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NegativePeopleInDaHouse11161 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), M = 0, P1 = 0, P2 = 0, total = 0, w = 0;
		String tmp = null;
		
		while (T-- > 0) {
			M = Integer.parseInt(br.readLine());
			total = 0;
			for (int i = 0; i < M; i++) {
				tmp = br.readLine();
				P1 = Integer.parseInt(tmp.split(" ")[0]);
				P2 = Integer.parseInt(tmp.split(" ")[1]);
				if (P2 > P1) total += P2-(P1+w);
				else if (P1 > P2) w += P1;
			}
			sb.append(total + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
