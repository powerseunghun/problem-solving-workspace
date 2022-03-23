package Acmicpc.OrderSubmit.TenThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class KidJungMin11382 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		BigInteger A = new BigInteger(tmp.split(" ")[0]);
		BigInteger B = new BigInteger(tmp.split(" ")[1]);
		BigInteger C = new BigInteger(tmp.split(" ")[2]);
		
		System.out.println(A.add(B).add(C));
		br.close();
	}
}
