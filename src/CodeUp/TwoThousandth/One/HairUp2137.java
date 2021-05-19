package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class HairUp2137 {
	// O(1)
	// input n : 1999999973, k : 991.1999 
	// answer : 999999986.6027, print : 999999986.6025
	// -> BigDecimal -???? yet 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		DecimalFormat df = new DecimalFormat("0.0000");
		
		double n = Double.parseDouble(tmp.split(" ")[0]);
		double x = Double.parseDouble(tmp.split(" ")[1]);
		System.out.println(n * x);
		double up = ((n-1) * (2 * 2 + (n-2)) / 2) + 1;
		up = (x * n) + (up / n);
		x = (x*n) - (int)(x*n) == 0 ? x*n+1 : Math.ceil(x*n);
		
		System.out.println(up-x);
	}
}