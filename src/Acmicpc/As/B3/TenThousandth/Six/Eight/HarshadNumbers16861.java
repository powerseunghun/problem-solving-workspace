package Acmicpc.As.B3.TenThousandth.Six.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HarshadNumbers16861 {
	static int getDivideSum(int N) {
		int sum = 0;
		while (N != 0) {
			sum += N%10;
			N /= 10;
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		while (true) {
			if (N % getDivideSum(N) == 0) {
				res = N;
				break;
			}
			N++;
		}
		
		System.out.println(res);
		br.close();
	}
}
