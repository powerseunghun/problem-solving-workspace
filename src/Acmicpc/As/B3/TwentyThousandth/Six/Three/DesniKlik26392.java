package Acmicpc.As.B3.TwentyThousandth.Six.Three;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class DesniKlik26392 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int r = Integer.parseInt(tmp.split(" ")[1]), max = 0, min = 0;
		
		while(n-- > 0) {
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			for (int i = 1; i <= r; i++) {
				tmp = br.readLine();
				if (tmp.contains("#")) {
					max = Math.max(max, i);
					min = Math.min(min, i);
				}
			}
			sb.append(Math.abs(max-min) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
