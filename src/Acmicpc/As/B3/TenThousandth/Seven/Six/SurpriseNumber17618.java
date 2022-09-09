package Acmicpc.As.B3.TenThousandth.Seven.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SurpriseNumber17618 {
	static boolean calc(int n) {
		int sum = 0, tmp = n;
		while (tmp != 0) {
			sum += tmp%10;
			tmp /= 10;
		}
		return n%sum == 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cnt = 0;
		
		for (int i = 1; i <= N; i++) {
			cnt = calc(i) ? cnt+1 : cnt;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
