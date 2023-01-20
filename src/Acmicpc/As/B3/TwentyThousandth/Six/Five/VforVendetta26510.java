package Acmicpc.As.B3.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VforVendetta26510 {
	static StringBuilder sb = new StringBuilder();
	static void func(int V) {
		int ls = 0, cs = 1 + Math.abs(2-V) * 2;
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < ls; j++) {
				sb.append(" ");
			}
			sb.append("*");
			for (int j = 0; j < cs; j++) {
				sb.append(" ");
			}
			sb.append((ls == V-1) ? "\n" :"*\n");
			ls++;
			cs-=2;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = 0;
		
		while(st.hasMoreTokens()) {
			V = Integer.parseInt(st.nextToken());
			func(V);
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
