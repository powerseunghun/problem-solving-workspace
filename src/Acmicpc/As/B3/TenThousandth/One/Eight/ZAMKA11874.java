package Acmicpc.As.B3.TenThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZAMKA11874 {
	static int digitSum(int N) {
		int sum = 0;
		while (N != 0) {
			sum += N%10;
			N /= 10;
		}
		return sum;
	}
	static int func(int a, int b, int X) {
		if (a <= b) {
			for (int i = a; i <= b; i++) {
				if (digitSum(i) == X) return i;
			}
		}
		else {
			for (int i = a; i >= b; i--) {
				if (digitSum(i) == X) return i;
			}
		}
		
		return 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int X = Integer.parseInt(br.readLine());
		
		System.out.println(func(L, D, X));
		System.out.println(func(D, L, X));
		
		br.close();
	}
}
