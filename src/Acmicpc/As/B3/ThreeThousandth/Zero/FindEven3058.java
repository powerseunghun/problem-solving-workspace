package Acmicpc.As.B3.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindEven3058 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), sum = 0, min = 0, val = 0;
		
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			sum = 0;
			min = Integer.MAX_VALUE;
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				sum += val % 2 == 0 ? val : 0;
				min = val % 2 == 0 ? Math.min(min, val) : min;
			}
			sb.append(sum + " " + min + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
