package Acmicpc.As.B2.TwentyThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Дробь21412 {
	static int gcd(int a, int b) {
		return b != 0 ? gcd(b, a%b) : a;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int res1 = 0, res2 = 0;
		
		for (int i = n/2; i >= 1; i--) {
			if (gcd(i, n-i) == 1) {
				res1 = i;
				res2 = n-i;
				break;
			}
		}
		
		System.out.println(res1 + " " + res2);
		br.close();
	}
}
