package Acmicpc.As.B3.TenThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlexOrigamiSquares11466 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		double h = Math.max(Double.parseDouble(tmp.split(" ")[0]), Double.parseDouble(tmp.split(" ")[1]));
		double w = Math.min(Double.parseDouble(tmp.split(" ")[0]), Double.parseDouble(tmp.split(" ")[1]));
		
		if (h > w*3) {
			sb.append(String.format("%.3f\n", w));
		}
		else if (h >= w*1.5) {
			sb.append(String.format("%.3f\n", h/3.0));
		}
		else {
			sb.append(String.format("%.3f\n", w/2.0));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
