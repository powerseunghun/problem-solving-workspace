package Acmicpc.As.B2.FourThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blocks4349 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = Integer.parseInt(br.readLine()), N = 0, min = 0;
		while(C-- > 0) {
			min = 1000 * 1000 * 1000;
			N = Integer.parseInt(br.readLine());
			for (int i = 1; i*i*i <= N; i++) {
				for (int j = i, val = 0; i*j*j <= N; j++) {
					if (N%(i*j) == 0) {
						val = N/(i*j);
						val = 2*i*j + 2*i*val + 2*j*val;
						min = Math.min(min, val);
					}
				}
			}
			sb.append(min).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
