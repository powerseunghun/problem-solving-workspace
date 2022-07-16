package Acmicpc.As.B3.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FourNumbers10824 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String A = tmp.split(" ")[0] + tmp.split(" ")[1];
		String B = tmp.split(" ")[2] + tmp.split(" ")[3];
		BigInteger sum = new BigInteger(A).add(new BigInteger(B));
		
		System.out.println(sum);
		br.close();
	}
}
