package Acmicpc.As.B3.TwentyThousandth.Two.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Шоколадка22150 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), n = 0, a = 0, b = 0;
		boolean flag = false;
		
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			
			flag = false;
			while (st.hasMoreTokens()) {
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				if (a+b != n) {
					sb.append("yes\n");
					flag = true;
					break;
				}
			}
			if (!flag) sb.append("no\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
