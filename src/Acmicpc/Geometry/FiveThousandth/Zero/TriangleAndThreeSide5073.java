package Acmicpc.Geometry.FiveThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleAndThreeSide5073 {
	static String d(int a, int b, int c) {
		int max = Math.max(Math.max(a, b), c);
		if (max == a) {
			if ((b + c) <= max) return "Invalid"; 
		}
		else if (max == b) {
			if ((a + c) <= max) return "Invalid";
		}
		else {
			if ((a + b) <= max) return "Invalid";
		}
		
		if (a == b && b == c) return "Equilateral";
		else if (a == b || b == c || a == c) return "Isosceles";
		else return "Scalene";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int a = 0, b = 0, c = 0;
		while (true) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			c = Integer.parseInt(tmp.split(" ")[2]);
			if (a == 0 && b == 0 && c == 0) break;
			
			sb.append(d(a, b, c) + "\n");
		}
		System.out.print(sb.toString());
	}
}
