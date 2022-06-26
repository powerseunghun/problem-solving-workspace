package Acmicpc.As.B3.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReducingImproperFractions9297 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String tmp = null;
		
		for (int i = 1; i <= t; i++) {
			sb.append("Case " + i + ": ");
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			
			if ((a/b) != 0 && (a%b) != 0) sb.append((a/b) + " " + (a%b) + "/" + b + "\n");
			else if ((a/b) != 0) sb.append((a/b) + "\n");
			else if ((a%b) != 0) sb.append((a%b) + "/" + b + "\n");
			else sb.append("0\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
