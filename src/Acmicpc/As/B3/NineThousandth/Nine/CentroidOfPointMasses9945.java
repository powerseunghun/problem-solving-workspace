package Acmicpc.As.B3.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CentroidOfPointMasses9945 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int idx = 1, t = 0;
		String str = null;
		double x = 0, y = 0, m = 0;
		
		while(true) {
			t = Integer.parseInt(br.readLine());
			if (t < 0) break;
			double a = 0, b = 0, c = 0;
			for (int i = 0; i < t; i++) {
				str = br.readLine();
				x = Double.parseDouble(str.split(" ")[0]);
				y = Double.parseDouble(str.split(" ")[1]);
				m = Double.parseDouble(str.split(" ")[2]);
				a += x*m;
				b += y*m;
				c += m;				
			}
			
			sb.append("Case ").append((idx++)).append(": ");
			sb.append(String.format("%.2f ", a/c));
			sb.append(String.format("%.2f", b/c)).append("\n");
			br.readLine();
		}
		
		System.out.print(sb.toString());
		br.close();
		
	}
}
