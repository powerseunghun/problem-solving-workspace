package Acmicpc.As.B2.SixThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CruelMathTeacher6097 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		BigInteger A = new BigInteger(tmp.split(" ")[0]);
		A = A.pow(Integer.parseInt(tmp.split(" ")[1]));
		
		tmp = A.toString();
		
		System.out.println(tmp.substring(0, tmp.length() < 70 ? tmp.length() : 70));
		br.close();
	}
}
