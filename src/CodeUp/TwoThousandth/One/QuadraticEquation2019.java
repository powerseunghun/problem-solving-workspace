package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class QuadraticEquation2019 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		DecimalFormat df = new DecimalFormat("0.00");
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int c = Integer.parseInt(tmp.split(" ")[2]);
		int D = (b * b) - (4 * a * c);
		double x = 0;
		
		if (D < 0) {
			x = Math.sqrt(D * -1) / (2.0 * a);
			System.out.println(df.format((-1 * b) / (2.0 * a)) + "+" + df.format(x < 0 ? x * -1 : x) + "i");
			System.out.println(df.format((-1 * b) / (2.0 * a)) + "-" + df.format(x < 0 ? x * -1 : x) + "i");
		}
		else if (D == 0) {
			x = (-1 * b) + Math.sqrt(D);
			System.out.println(df.format(x / (2.0 * a)));
		}
		else {
			x = (-1 * b) + Math.sqrt(D);
			System.out.println(df.format(x / (2.0 * a)));
			x = (-1 * b) - Math.sqrt(D);
			System.out.println(df.format(x / (2.0 * a)));
		}
	}
}
