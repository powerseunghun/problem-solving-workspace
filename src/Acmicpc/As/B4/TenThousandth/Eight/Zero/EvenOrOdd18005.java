package Acmicpc.As.B4.TenThousandth.Eight.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenOrOdd18005 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if (n % 2 != 0) System.out.println("0");
		else {
			if (n / 2 % 2 == 0) System.out.println("2");
			else System.out.println("1");
		}
		br.close();
	}
}
