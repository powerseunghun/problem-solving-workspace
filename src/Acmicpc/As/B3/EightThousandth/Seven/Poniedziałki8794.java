package Acmicpc.As.B3.EightThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Poniedziałki8794 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Z = Integer.parseInt(br.readLine()), N = 0, M = 0, L = 0, cnt = 0;
		String tmp = null;
		
		while (Z-- > 0) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			L = Integer.parseInt(tmp.split(" ")[2]);
			cnt = 0;
			for (int i = 1, cur = L; i <= N; i++) {
				if (cur == 1) cnt++;
				cur++;
				if (cur > M) cur = 1;
			}
			sb.append(cnt + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
