package Acmicpc.As.B3.TenThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumKindOfProblem11522 {
	static int getSum(int N) {
		int sum = N%2 == 0 ? (N+1) * (N/2) : (N+1) * ((N/2)+1) - (N/2+1);
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, S = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine().split(" ")[1]);
			S = getSum(N);
			sb.append(i + " " + S + " " + (S*2-N) + " " + (S*2) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
