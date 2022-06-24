package Acmicpc.As.B3.EightThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Szachy8725 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), res = 0, val = 0, tn = 0;
		StringTokenizer st = null;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			tn = Integer.MIN_VALUE;
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				tn = Math.max(val, tn);
			}
			res += Math.max(tn, 0);
		}
		
		System.out.println(res);
		br.close();
	}
}
