package Acmicpc.As.B2.TenThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WorkAllDay15035 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(br.readLine()), d = Integer.MAX_VALUE, v = 0, res = 0;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			if (M % v < d) {
				d = M % v;
				res = v;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
