package Acmicpc.As.B4.TenThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialDay10768 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		if (m == 2 && d == 18) {
			System.out.println("Special");
		}
		else if (m < 2) {
			System.out.println("Before");
		}
		else if (m >= 2) {
			if (m == 2) {
				if (d < 18) {
					System.out.println("Before");
				}
				else System.out.println("After");
			}
			else System.out.println("After");
		}
		
		br.close();
	}
}
