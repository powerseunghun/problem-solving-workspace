package Acmicpc.OrderSubmit.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigNumberMultiple13277 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		BigInteger A = new BigInteger(tmp.split(" ")[0]);
		BigInteger B = new BigInteger(tmp.split(" ")[1]);
		
		System.out.println(A.multiply(B));
		br.close();
	}
}
