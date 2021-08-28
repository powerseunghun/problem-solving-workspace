package Acmicpc.Geometry.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle2527 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int x1 = 0, y1 = 0, p1 = 0, q1 = 0;
		int x2 = 0, y2 = 0, p2 = 0, q2 = 0;
		
		for (int i = 0; i < 4; i++) {
			tmp = br.readLine();
			x1 = Integer.parseInt(tmp.split(" ")[0]);
			y1 = Integer.parseInt(tmp.split(" ")[1]);
			p1 = Integer.parseInt(tmp.split(" ")[2]);
			q1 = Integer.parseInt(tmp.split(" ")[3]);
			x2 = Integer.parseInt(tmp.split(" ")[4]);
			y2 = Integer.parseInt(tmp.split(" ")[5]);
			p2 = Integer.parseInt(tmp.split(" ")[6]);
			q2 = Integer.parseInt(tmp.split(" ")[7]);
			
			if ((p1 == x2 && q1 == y2) || (x1 == p2 && q1 == y2) || (p1 == x2 && y1 == q2)) {
				sb.append("c\n");
			}
			else if ((p1 == x2 && q1 != y2) || (x1 == p2 && q1 != y2) || (p1 != x2 && y1 == q2) || (y1 == q2 && x1 != p2)) {
				sb.append("b\n");
			}
			else if (p1 < x2 || p2 < x1 || q1 < y2 || q2 < y1) {
				sb.append("d\n");
			}
			else sb.append("a\n");
		}
		System.out.print(sb.toString());
	}
}
