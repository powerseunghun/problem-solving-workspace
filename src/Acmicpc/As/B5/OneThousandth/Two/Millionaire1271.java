package Acmicpc.As.B5.OneThousandth.Two;

import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;

public class Millionaire1271 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		BigInteger n = new BigInteger(tmp.split(" ")[0]);
		BigInteger m = new BigInteger(tmp.split(" ")[1]);
		
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
		br.close();
	}
}
