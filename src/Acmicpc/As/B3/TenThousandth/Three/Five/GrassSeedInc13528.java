package Acmicpc.As.B3.TenThousandth.Three.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrassSeedInc13528 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double C = Double.parseDouble(br.readLine()), w = 0, h = 0, area = 0;
		int L = Integer.parseInt(br.readLine());
		String tmp = null;
		
		while (L-- > 0) {
			tmp = br.readLine();
			w = Double.parseDouble(tmp.split(" ")[0]);
			h = Double.parseDouble(tmp.split(" ")[1]);
			area += (w*h);
		}
		
		System.out.println(String.format("%.7f\n", C*area));
		br.close();
	}
}
