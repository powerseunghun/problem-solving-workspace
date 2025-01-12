package Acmicpc.As.B2.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PerfectNumber14563 {
	static String func(int v) {
		int res = 0;
		for (int i = 1; i <= v-1; i++) {
			if (v%i == 0) res+=i;
		}
		return res>v ? "Abundant" : res < v ? "Deficient" : "Perfect";
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0, v = 0;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			sb.append(func(v)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
