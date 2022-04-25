package Acmicpc.OrderSubmit.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigNumber14928 {
	static final int mod = 20000303;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i) - '0';
			res = (res * 10 + c) % mod;
		}
		
		System.out.println(res);
		br.close();
	}
}
