package Acmicpc.As.B3.TenThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrozenTicketReservation18247 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0;
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			if (N < 12 || M < 4) {
				sb.append("-1\n");
				continue;
			}
			sb.append((11*M+4) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
