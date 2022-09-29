package Acmicpc.As.B3.TwentyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 割り勘22380 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0, m = 0, sum = 0;
		StringTokenizer st = null;
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			m = Integer.parseInt(tmp.split(" ")[1]);
			if (n == 0 && m == 0) break;
			
			sum = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				sum += Math.min(m/n, Integer.parseInt(st.nextToken()));
			}
			sb.append(sum + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
