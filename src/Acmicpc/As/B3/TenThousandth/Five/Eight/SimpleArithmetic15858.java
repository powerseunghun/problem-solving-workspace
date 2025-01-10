package Acmicpc.As.B3.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;

public class SimpleArithmetic15858 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		BigDecimal a = new BigDecimal(Integer.parseInt(str.split(" ")[0]));
		BigDecimal b = new BigDecimal(Integer.parseInt(str.split(" ")[1]));
		BigDecimal c = new BigDecimal(Integer.parseInt(str.split(" ")[2]));
		
		System.out.print(a.multiply(b).divide(c, MathContext.DECIMAL128));
		br.close();
	}
}
