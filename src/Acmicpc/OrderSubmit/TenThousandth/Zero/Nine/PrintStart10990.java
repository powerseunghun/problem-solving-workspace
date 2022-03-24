package Acmicpc.OrderSubmit.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStart10990 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), left = N-1, center = 1;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < left; j++) {
				System.out.print(" ");
			}
			left--;
			System.out.print("*");
			if (i == 0) {
				System.out.println();
				continue;
			}
			
			for (int j = 0; j < center; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			center += 2;
		}
		br.close();
		
	}
}
