package Acmicpc.OrderSubmit.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigNumber14928 {
	static BigInteger mod = new BigInteger("20000303");
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger N = new BigInteger(br.readLine());
		
		System.out.println(N.remainder(mod));
		br.close();
	}
}
