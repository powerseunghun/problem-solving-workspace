package Acmicpc.As.B2.TenThousandth.Seven.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NmodP17466 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long N = Long.parseLong(str.split(" ")[0]);
		long P = Long.parseLong(str.split(" ")[1]);
		long res = 1;
		
		for (long i = 1; i <= N; i++) {
			res = (res * i) % P;
		}
		
		System.out.println(res);
		br.close();
	}
}
