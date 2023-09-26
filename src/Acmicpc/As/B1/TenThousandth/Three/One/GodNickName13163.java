package Acmicpc.As.B1.TenThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GodNickName13163 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			sb.append("god");
			st.nextToken();
			while (st.hasMoreTokens()) {
				sb.append(st.nextToken());
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
