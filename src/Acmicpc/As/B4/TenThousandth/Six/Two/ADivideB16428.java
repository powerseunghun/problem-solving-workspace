package Acmicpc.As.B4.TenThousandth.Six.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ADivideB16428 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		BigInteger A = new BigInteger(tmp.split(" ")[0]);
		BigInteger B = new BigInteger(tmp.split(" ")[1]);
		
		if (A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == -1) {
			System.out.println(A.divide(B).add(BigInteger.ONE));
			System.out.println(A.remainder(B).subtract(B));			
		}
		else if (A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == 1) {
			System.out.println(A.divide(B).subtract(BigInteger.ONE));
			System.out.println(A.remainder(B).add(B));
		}
		else {
			System.out.println(A.divide(B));
			System.out.println(A.remainder(B));
		}
		br.close();
	}
}
