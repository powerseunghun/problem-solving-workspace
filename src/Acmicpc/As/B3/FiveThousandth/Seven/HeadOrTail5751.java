package Acmicpc.As.B3.FiveThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HeadOrTail5751 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = 0, val = 0, zeroCount = 0, oneCount = 0;
		
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			st = new StringTokenizer(br.readLine());
			zeroCount = 0;
			oneCount = 0;
			
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				zeroCount += val == 0 ? 1 : 0;
				oneCount += val == 1 ? 1 : 0;
			}
			sb.append("Mary won " + zeroCount + " times and John won " + oneCount + " times\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
