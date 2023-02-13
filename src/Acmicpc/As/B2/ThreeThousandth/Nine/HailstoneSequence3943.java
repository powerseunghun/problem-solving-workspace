package Acmicpc.As.B2.ThreeThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HailstoneSequence3943 {
	static int get(int N) {
		int max = N;
		
		while (N != 1) {
			N = N%2 == 0 ? N/2 : N*3+1;
			max = Math.max(max, N);
		}
		return max;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			sb.append(get(N) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
