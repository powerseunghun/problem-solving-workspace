package Acmicpc.As.B3.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmericanStyle2712 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		double n = 0;
		String tmp = null, b = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			n = Double.parseDouble(tmp.split(" ")[0]);
			b = tmp.split(" ")[1];
			switch(b) {
			case "kg":
				sb.append(String.format("%.4f lb\n", n*2.2046));
				break;
			case "lb":
				sb.append(String.format("%.4f kg\n", n*0.4536));
				break;
			case "l":
				sb.append(String.format("%.4f g\n", n*0.2642));
				break;
			case "g":
				sb.append(String.format("%.4f l\n", n*3.7854));
				break;
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
