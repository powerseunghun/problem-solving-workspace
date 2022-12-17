package Acmicpc.As.S3.TenThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Product12779 {
	static BigInteger GCD(BigInteger A, BigInteger B) {
		if (B.equals(BigInteger.valueOf(0))) return A;
		else return GCD(B, A.mod(B));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		BigInteger A = new BigInteger(tmp.split(" ")[0]);
		BigInteger B = new BigInteger(tmp.split(" ")[1]);
		BigInteger C = new BigInteger("0");
		BigInteger D = null;
		
		for (long i = (long)(Math.sqrt(A.longValue())); i*i <= B.longValue(); i++) {
			C = i*i > A.longValue() ? C.add(new BigInteger("1")) : C.add(new BigInteger("0"));
		}
		
		if (C.equals(BigInteger.valueOf(0))) {
			System.out.println("0");
		}
		else {
			D = GCD(B.subtract(A), C);
			System.out.println(C.divide(D) + "/" + (B.subtract(A).divide(D)));
		}
	}
}
