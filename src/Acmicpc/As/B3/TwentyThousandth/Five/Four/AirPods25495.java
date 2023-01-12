package Acmicpc.As.B3.TwentyThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AirPods25495 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int pre = -1, a = 0, res = 0, cum = 0, dup = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			a = Integer.parseInt(st.nextToken());
			if (pre != a) {
				pre = a;
				dup = 1;
			}
			dup *= 2;
			cum += dup;
			if (cum >= 100) {
				cum = 0;
				dup = 1;
			}
		}
		
		System.out.println(cum);
		br.close();
	}
}
