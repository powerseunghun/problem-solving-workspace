package Acmicpc.As.B3.TenThousandth.Two.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewLotteryGame12250 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), A = 0, B = 0, K = 0, cnt = 0;
		String tmp = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			K = Integer.parseInt(tmp.split(" ")[2]);
			cnt = 0;
			for (int j = 0; j < A; j++) {
				for (int k = 0; k < B; k++) {
					if ((j&k) < K) cnt++;
				}
			}
			sb.append("Case #" + i + ": " + cnt + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
