package Acmicpc.OrderSubmit.Thousandth.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BinarySum1252 {
//	static long getNumber(String tmp) {
//		int weight = 0;
//		long res = 0;
//		for (int i = tmp.length()-1; i >= 0; i--) {
//			res += (Math.pow(2, weight++) * (tmp.charAt(i) - '0'));
//		}
//		return res;
//	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		BigInteger A = new BigInteger(tmp.split(" ")[0]);
		BigInteger B = new BigInteger(tmp.split(" ")[1]);
		A = new BigInteger(A.toString(), 2).add(new BigInteger(B.toString(), 2));
		
		System.out.println(A.toString(2));
		br.close();
	}
}
