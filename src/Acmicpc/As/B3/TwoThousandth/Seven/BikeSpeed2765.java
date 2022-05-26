package Acmicpc.As.B3.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BikeSpeed2765 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		double d = 0, r = 0, t = 0, dist = 0;
		
		for (int i = 1; ; i++) {
			tmp = br.readLine();
			d = Double.parseDouble(tmp.split(" ")[0]);
			r = Double.parseDouble(tmp.split(" ")[1]);
			t = Double.parseDouble(tmp.split(" ")[2]);
			if (r == 0) break;
			
			t /= 3600;
			dist = ((d * 3.1415927 * r) / 12) / 5280;
			sb.append("Trip #" + i + ": ");
			sb.append(String.format("%.2f", dist) + " " + String.format("%.2f\n", dist/t));
		}
		System.out.print(sb.toString());
		br.close();
	}
}
