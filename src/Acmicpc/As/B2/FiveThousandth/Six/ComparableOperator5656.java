package Acmicpc.As.B2.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComparableOperator5656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int idx = 1, A = 0, B = 0;
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[2]);
			tmp = tmp.split(" ")[1];
			if (tmp.equals("E")) break;
			sb.append("Case ").append(idx++).append(": ");
			switch(tmp) {
			case ">":
				sb.append(A > B);
				break;
			case ">=":
				sb.append(A >= B);
				break;
			case "<":
				sb.append(A < B);
				break;
			case "<=":
				sb.append(A <= B);
				break;
			case "==":
				sb.append(A == B);
				break;
			case "!=":
				sb.append(A != B);
				break;
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
