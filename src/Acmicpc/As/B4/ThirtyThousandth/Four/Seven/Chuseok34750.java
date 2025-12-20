package Acmicpc.As.B4.ThirtyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chuseok34750 {
	static int func(int N, int w) {
		return N*w/100;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int res1 = 0, res2 = 0;
		if (N >= 1000000) {
			res1 = func(N, 20);
			res2 = func(N, 80);
		} else if (N >= 500000) {
			res1 = func(N, 15);
			res2 = func(N, 85);
		} else if (N >= 100000) {
			res1 = func(N, 10);
			res2 = func(N, 90);
		} else {
			res1 = func(N, 5);
			res2 = func(N, 95);
		}
		
		System.out.println(res1 + " " + res2);
		br.close();
	}
}
