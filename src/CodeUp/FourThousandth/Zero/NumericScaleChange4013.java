package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumericScaleChange4013 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("2 " + Integer.toBinaryString(n));
		System.out.println("8 " + Integer.toOctalString(n));
		System.out.println("16 " + Integer.toHexString(n).toUpperCase());
	}
}
