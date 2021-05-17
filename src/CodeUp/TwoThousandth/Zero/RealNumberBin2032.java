package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealNumberBin2032 {
	static String getBinary(double lf) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		while(count < 10) {
			count++;
			lf *= 2;
			sb.append((lf + "").charAt(0));
			if (lf >= 1) {
				lf -= 1;
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double lf = Double.parseDouble("0." + br.readLine());
		System.out.println(getBinary(lf));
	}
}
