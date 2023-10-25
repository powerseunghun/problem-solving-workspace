package Acmicpc.As.S5.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersSum2018 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int l = 0, r = 0, sum = 0, res = 0;
		
		while(l <= N) {
			while (r++ <= N) {
				sum += r;
				if (sum >= N) {
					res = sum == N ? res+1 : res;
					break;
				}
			}
			while(l++ <= N) {
				sum -= l;
				if (sum <= N) {
					res = sum == N ? res+1 : res;
					break;
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
