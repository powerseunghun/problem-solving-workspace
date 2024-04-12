package Acmicpc.As.B5.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LoteriaFalha30664 {
	static final BigInteger mod = new BigInteger("42");
	static final BigInteger zero = new BigInteger("0");
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			BigInteger n = new BigInteger(br.readLine());
			if (n.equals(zero)) break;
			sb.append(n.mod(mod).equals(zero) ? "PREMIADO" : "TENTE NOVAMENTE").append("\n"); 
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
