package Acmicpc.As.B3.FiveThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EvenSumMoreThanOddSum5235 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), val = 0, evenSum = 0, oddSum = 0;
		StringTokenizer st = null;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			evenSum = 0;
			oddSum = 0;
			st.nextToken();
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				if (val % 2 == 0) evenSum += val;
				else oddSum += val;
			}
			if (oddSum == evenSum) sb.append("TIE");
			else if (oddSum > evenSum) sb.append("ODD");
			else sb.append("EVEN");
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
