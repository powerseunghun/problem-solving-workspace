package Acmicpc.As.B3.NineThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VonNeumann9469 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int P = Integer.parseInt(br.readLine());
		double D = 0, A = 0, B = 0, F = 0, res = 0;
		String tmp = null;
		
		while (P-- > 0) {
			tmp = br.readLine();
			sb.append(Integer.parseInt(tmp.split(" ")[0]) + " ");
			D = Double.parseDouble(tmp.split(" ")[1]);
			A = Double.parseDouble(tmp.split(" ")[2]);
			B = Double.parseDouble(tmp.split(" ")[3]);
			F = Double.parseDouble(tmp.split(" ")[4]);
			res = D / (A+B) * F;
			sb.append(String.format("%.6f\n", res));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
