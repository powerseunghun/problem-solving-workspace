package Acmicpc.As.B3.NineThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonitorDPI9317 {
	static double W = 0, H = 0;
	static void calc(double D) {
		W = (16 * D) / Math.sqrt(337);
		H = (9.0 / 16) * W;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double D = 0, RH = 0, RV = 0;
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			D = Double.parseDouble(tmp.split(" ")[0]);
			RH = Double.parseDouble(tmp.split(" ")[1]);
			RV = Double.parseDouble(tmp.split(" ")[2]);
			if(D == 0 && RH == 0 && RV == 0) break;
			calc(D);
			
			sb.append("Horizontal DPI: " + String.format("%.2f\n", RH/W));
			sb.append("Vertical DPI: " + String.format("%.2f\n", RV/H));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
