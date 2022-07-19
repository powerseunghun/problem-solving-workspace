package Acmicpc.As.B3.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InTheShower11176 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), E = 0, N = 0, cnt = 0;
		
		while (T-- > 0) {
			tmp = br.readLine();
			E = Integer.parseInt(tmp.split(" ")[0]);
			N = Integer.parseInt(tmp.split(" ")[1]);
			cnt = 0;
			for (int i = 0; i < N; i++) {
				if (Integer.parseInt(br.readLine()) > E) cnt++;
			}
			sb.append(cnt + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
