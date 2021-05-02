package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GradeDistinction1202 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int g = Integer.parseInt(br.readLine());
		
		if (g >= 90) {
			System.out.println("A");
		}
		else if (g >= 80) {
			System.out.println("B");
		}
		else if (g >= 70) {
			System.out.println("C");
		}
		else if (g >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}
