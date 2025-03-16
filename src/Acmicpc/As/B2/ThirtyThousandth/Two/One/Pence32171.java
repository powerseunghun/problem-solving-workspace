package Acmicpc.As.B2.ThirtyThousandth.Two.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pence32171 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0, d = 0;
		int xMin = Integer.MAX_VALUE, xMax = Integer.MIN_VALUE;
		int yMin = Integer.MAX_VALUE, yMax = Integer.MIN_VALUE;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			c = Integer.parseInt(str.split(" ")[2]);
			d = Integer.parseInt(str.split(" ")[3]);
			xMin = Math.min(xMin, a);
			xMax = Math.max(xMax, c);
			yMin = Math.min(yMin, b);
			yMax = Math.max(yMax, d);
			sb.append(2*(xMax-xMin+yMax-yMin)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
