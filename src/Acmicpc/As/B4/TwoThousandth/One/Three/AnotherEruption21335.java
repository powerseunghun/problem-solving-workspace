package Acmicpc.As.B4.TwoThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnotherEruption21335 {
	static final double pi = 3.14159265359;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
		
		System.out.printf("%.9f", Math.sqrt(a/pi) * 2 * pi);
		br.close();
	}
}
