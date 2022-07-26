package Acmicpc.As.B3.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Continuous11648 {
	static int func(int N) {
		int mul = 1;
		while (N != 0) {
			mul *= (N%10);
			N /= 10;
		}
		return mul;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), c = 0;
		
		while (N >= 10) {
			c++;
			N = func(N);
		}
		
		System.out.println(c);
		br.close();
	}
}
