package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeralSystemChange1125 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.printf("%o %X\n", n, n);
//		System.out.println(Integer.toOctalString(n));
//		System.out.println(Integer.toHexString(n));
	}
}
