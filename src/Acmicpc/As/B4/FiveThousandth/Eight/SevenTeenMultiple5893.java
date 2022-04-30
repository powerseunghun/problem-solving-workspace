package Acmicpc.As.B4.FiveThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SevenTeenMultiple5893 {
//	static long getNum(String str) {
//		long sum = 0;
//		for (int i = str.length()-1; i >= 0; i--) {
//			sum += (str.charAt(i)-'0') * Math.pow(2, str.length()-(i+1));
//		}
//		return sum;
//	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		BigInteger n = new BigInteger("0");
		
		for (int i = 0; i < str.length(); i++) {
			n = str.charAt(i) == '0' 
					? n.add(new BigInteger("0")) 
					: n.add(new BigInteger("2").pow(str.length()-(i+1)));
		}
		n = n.multiply(new BigInteger("17"));
		while (n != BigInteger.valueOf(0)) {
			sb.append(n.mod(BigInteger.valueOf(2)));
			n = n.divide(BigInteger.valueOf(2));
		}
		
		System.out.println(sb.reverse().toString());
		br.close();
	}
}
