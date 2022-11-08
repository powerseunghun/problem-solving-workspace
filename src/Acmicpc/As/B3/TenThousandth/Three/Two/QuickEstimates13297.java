package Acmicpc.As.B3.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickEstimates13297 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while (T-- > 0) {
			sb.append(br.readLine().length()+"\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
