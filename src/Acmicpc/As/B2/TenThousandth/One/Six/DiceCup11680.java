package Acmicpc.As.B2.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceCup11680 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		
		if (N > M) {
			int tmp = N;
			N = M;
			M = tmp;
		}
		
		for (int i = N+1; i <= M+1; i++) {
			sb.append(i).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
