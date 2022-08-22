package Acmicpc.As.B3.TenThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Angels15178 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), angle = 0, ta = 0;
		StringTokenizer st = null;
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			angle = 0;
			while (st.hasMoreTokens()) {
				ta = Integer.parseInt(st.nextToken());
				angle += ta;
				sb.append(ta + " ");
			}
			sb.append(angle == 180 ? "Seems OK\n" : "Check\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
