package Acmicpc.As.B2.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PicturePefect6904 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = 0, w = 0, h = 0, min = 0;
		
		while(true) {
			C = Integer.parseInt(br.readLine());
			if (C == 0) break;
			min = Integer.MAX_VALUE; w = 0; h = 0;
			for (int i = 1; i <= Math.sqrt(C); i++) {
				for (int j = 1; i*j <= C; j++) {
					if (i*j == C && ((2*i)+(2*j)) < min) {
						min = 2*i + 2*j;
						w = i;
						h = j;
					}
				}
			}
			//Minimum perimeter is 40 with dimensions 10 x 10

			sb.append("Minimum perimeter is " + min + " with dimensions ");
			sb.append(w + " x " + h).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
