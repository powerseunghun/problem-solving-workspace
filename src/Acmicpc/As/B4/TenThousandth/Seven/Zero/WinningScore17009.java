package Acmicpc.As.B4.TenThousandth.Seven.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WinningScore17009 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 3; j >= 1; j--) {
				switch(i) {
				case 0:
					sum1 += Integer.parseInt(br.readLine()) * j;
					break;
				case 1:
					sum2 += Integer.parseInt(br.readLine()) * j;
					break;
				}
			}
		}
		if (sum1 > sum2) System.out.println("A");
		else if (sum1 < sum2) System.out.println("B");
		else System.out.println("T");
		
		br.close();
	}
}
