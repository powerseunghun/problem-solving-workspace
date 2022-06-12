package Acmicpc.As.B3.SixThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Superlatives6162 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()), A = 0, E = 0, n = 0, idx = 1;
		String tmp = null;
		
		while (K-- > 0) {
			tmp = br.readLine();
			E = Integer.parseInt(tmp.split(" ")[0]);
			A = Integer.parseInt(tmp.split(" ")[1]);
			sb.append("Data Set " + (idx++) + ":\n");
			for (n = 0; A < E; n++) {
				A *= 5;
			}
			if (n == 0) {
				sb.append("no drought\n\n");
				continue;
			}
			
			for (int i = 0; i < n-1; i++) {
				sb.append("mega ");
			}
			sb.append("drought\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
