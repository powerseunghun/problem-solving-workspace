package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WidmarkFormula4082 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double[] base = {0.03, 0.08};
		double A = Double.parseDouble(tmp.split(" ")[0]);
		A = A * (Double.parseDouble(tmp.split(" ")[1]) / 100) * 0.7984;
		double P = Double.parseDouble(tmp.split(" ")[2]);
		double R = Integer.parseInt(tmp.split(" ")[3]) == 1 ? 0.7 : 0.6;
		double C = (A / (P * R)) / 10;
		
		tmp = br.readLine();
		int h = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		double time = ((h * 60) + m - 30) / (double)60;
		
		C = C - (0.015 * time);
		C = C <= 0 ? 0 : C;
		C = Double.parseDouble(String.format("%.3f", C));
		
		for (int i = 0; i < base.length; i++) {
			if (C < base[i]) {
				switch(i) {
				case 0:
					System.out.printf("%.3f pass", C);
					break;
				case 1:
					System.out.printf("%.3f stop", C);
					break;
				}
				return;
			}
		}
		System.out.printf("%.3f cancel", C);
	}
}
