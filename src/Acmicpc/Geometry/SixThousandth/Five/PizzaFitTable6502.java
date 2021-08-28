package Acmicpc.Geometry.SixThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaFitTable6502 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int r = 0, w = 0, l = 0, order = 1;
		
		while (true) {
			tmp = br.readLine();
			r = Integer.parseInt(tmp.split(" ")[0]);
			if (r == 0) break;
			w = Integer.parseInt(tmp.split(" ")[1]);
			l = Integer.parseInt(tmp.split(" ")[2]);
			
			if (r*2 >= Math.sqrt(w*w + l*l)) {
				sb.append("Pizza " + order++ + " fits on the table.\n");
			}
			else sb.append("Pizza " + order++ + " does not fit on the table.\n");
		}
		
		System.out.print(sb.toString());
	}
}
