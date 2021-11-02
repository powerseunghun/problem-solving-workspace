package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadraticEquation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int c = Integer.parseInt(tmp.split(" ")[2]);
		double d = Math.pow(b, 2) - (4*a*c), res1 = 0, res2 = 0;
		
		if (d > 0) {
			res1 = ((-1 * b) + Math.sqrt(d)) / (2 * a);
			res2 = ((-1 * b) - Math.sqrt(d)) / (2 * a);
			System.out.printf("%.2f %.2f\n", res1, res2);
		}
		else if (d < 0) {
			System.out.println("X");
		}
		else {
			res1 = (-1 * b) / (2 * a);
			System.out.printf("%.2f\n", res1);
		}
	}
}
