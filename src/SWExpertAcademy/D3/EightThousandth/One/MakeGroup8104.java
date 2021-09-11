package SWExpertAcademy.D3.EightThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeGroup8104 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, K = 0, S = 0, tn = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			K = Integer.parseInt(tmp.split(" ")[1]);
			tn = N/2 + (N%2);
			S = (2*K*tn+1) * tn;
			sb.append("#" + i + " ");
			for (int k = 1; k <= K; k++) {
				if (N % 2 == 0) sb.append(S + " ");
				else sb.append(S-((N+1)*K-k+1) + " ");
				if (K == k) sb.append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}
