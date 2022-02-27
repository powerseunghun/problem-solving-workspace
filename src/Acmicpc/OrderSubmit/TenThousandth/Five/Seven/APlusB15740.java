package Acmicpc.OrderSubmit.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class APlusB15740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		BigInteger A = new BigInteger(tmp.split(" ")[0]);
		BigInteger B = new BigInteger(tmp.split(" ")[1]);
		
		System.out.println(A.add(B));
		br.close();
	}
}
