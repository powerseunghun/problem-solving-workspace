package Acmicpc.As.B3.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gauß7523 {
	static long n = 0, m = 0;
	static long get(long d) {
		return (d * (2 * n + (d-1))) / 2;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), idx = 1;
		String tmp = null;
		
		// 22 * (-22 + 21)
		while (t-- > 0) {
			tmp = br.readLine();
			n = Long.parseLong(tmp.split(" ")[0]);
			m = Long.parseLong(tmp.split(" ")[1]);
			sb.append("Scenario #" + (idx++) + ":\n" + get(m-n+1) + "\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
