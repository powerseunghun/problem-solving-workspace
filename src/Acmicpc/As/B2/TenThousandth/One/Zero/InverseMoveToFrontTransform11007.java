package Acmicpc.As.B2.TenThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InverseMoveToFrontTransform11007 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), v = 0;
		StringTokenizer st = null; 
		
		while(T-- > 0) {
			br.readLine();
			String str = "abcdefghijklmnopqrstuvwxyz";
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				v = Integer.parseInt(st.nextToken());
				char c = str.charAt(v);
				sb.append(c);
				str = str.charAt(v) + str.substring(0, v) + str.substring(v+1);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
