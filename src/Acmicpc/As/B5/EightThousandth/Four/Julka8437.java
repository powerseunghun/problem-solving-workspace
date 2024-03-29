package Acmicpc.As.B5.EightThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Julka8437 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		
		System.out.println(A.add(B).divide(new BigInteger("2")));
		System.out.println(A.subtract(A.add(B).divide(new BigInteger("2"))));
		br.close();
	}
}
