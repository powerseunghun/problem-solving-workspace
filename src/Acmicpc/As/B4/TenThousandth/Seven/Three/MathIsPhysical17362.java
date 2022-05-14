package Acmicpc.As.B4.TenThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathIsPhysical17362 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n <= 5) {
			System.out.println(n);
			return;
		}
		n %= 8;
		
		if (n == 0) System.out.println("2");
		else {
			System.out.println(n <= 5 ? n : 10-n);
		}
		
		br.close();
	}
}
