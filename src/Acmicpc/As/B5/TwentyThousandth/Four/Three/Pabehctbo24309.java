package Acmicpc.As.B5.TwentyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Pabehctbo24309 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		BigInteger C = new BigInteger(br.readLine());
		
		System.out.println(B.subtract(C).divide(A));
		br.close();
	}
}
