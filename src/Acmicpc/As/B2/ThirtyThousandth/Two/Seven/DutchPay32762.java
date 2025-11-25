package Acmicpc.As.B2.ThirtyThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DutchPay32762 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			br.readLine();
		}
		for (int i = 0; i < M; i++) {
			str = br.readLine();
			sum += Integer.parseInt(str.split(" ")[1]);
		}
		
		System.out.println(String.format("%.5f", sum/(double)N));
		br.close();
	}
}
