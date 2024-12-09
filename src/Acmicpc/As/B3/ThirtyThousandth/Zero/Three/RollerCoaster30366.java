package Acmicpc.As.B3.ThirtyThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RollerCoaster30366 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]);
		long res = 0, c = 0, a = 0;
		
		while(st.hasMoreTokens()) {
			a = Long.parseLong(st.nextToken());
			if (c+a > m) {
				c = 0;
				res++;
			}
			c += a;
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
