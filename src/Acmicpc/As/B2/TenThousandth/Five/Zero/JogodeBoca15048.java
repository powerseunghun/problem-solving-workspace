package Acmicpc.As.B2.TenThousandth.Five.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JogodeBoca15048 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger bi = new BigInteger(br.readLine());
		
		System.out.println(bi.mod(new BigInteger("3")));
		br.close();
	}
}
