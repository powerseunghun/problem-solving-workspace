package Acmicpc.As.B2.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HailstoneSequences5679 {
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int H = 0, max = 0;
		
		while(true) {
			H = Integer.parseInt(br.readLine());
			if (H == 0) break;
			max = H;
			
			while (H != 1) {
				H = H % 2 != 0 ? H*3+1 : H/2;
				max = Math.max(max, H);
			}
			
			sb.append(max).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
