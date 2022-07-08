package Acmicpc.As.B3.NineThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfOddSequence9713 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, sum = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			sum = 0;
			for (int i = 1; i <= N; i += 2) {
				sum += i;
			}
			sb.append(sum + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
