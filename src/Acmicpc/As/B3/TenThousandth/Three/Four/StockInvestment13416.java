package Acmicpc.As.B3.TenThousandth.Three.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StockInvestment13416 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, A = 0, B = 0, C = 0, sum = 0;
		String tmp = null;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			sum = 0;
			for (int i = 0; i < N; i++) {
				tmp = br.readLine();
				A = Integer.parseInt(tmp.split(" ")[0]);
				B = Integer.parseInt(tmp.split(" ")[1]);
				C = Integer.parseInt(tmp.split(" ")[2]);
				if (A < 0 && B < 0 && C < 0) continue;
				sum += Math.max(A, Math.max(B, C));
			}
			sb.append(sum + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
