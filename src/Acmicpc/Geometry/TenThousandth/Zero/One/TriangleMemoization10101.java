package Acmicpc.Geometry.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleMemoization10101 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, count = 0;
		int[] angle = new int[3];
		
		for (int i = 0; i < angle.length; i++) {
			angle[i] = Integer.parseInt(br.readLine());
			sum += angle[i];
		}
		
		if (sum != 180) {
			System.out.println("Error");
			return;
		}
		
		for (int i = 0; i < angle.length-1; i++) {
			for (int j = i+1; j < angle.length; j++) {
				if (angle[i] == angle[j]) count++;
			}
		}
		if (count == 0) System.out.println("Scalene");
		else if (count == 1) System.out.println("Isosceles");
		else System.out.println("Equilateral");
	}
}
