package SWExpertAcademy.D1.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleDouble2019 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), val = 1;
		
		System.out.print(val + " ");
		for (int i = 1; i <= N; i++) {
			val *= 2;
			System.out.print(val + " ");
		}
		
	}
}
