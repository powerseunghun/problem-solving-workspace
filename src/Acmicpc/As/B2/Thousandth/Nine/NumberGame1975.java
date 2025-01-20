package Acmicpc.As.B2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame1975 {
	static int func(int N, int i) {
		int res = 0;
		while(N % i == 0) {
			N /= i;
			res++;
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			int res = 0;
			for (int i = 2; i <= N; i++) {
				res += func(N, i);
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
