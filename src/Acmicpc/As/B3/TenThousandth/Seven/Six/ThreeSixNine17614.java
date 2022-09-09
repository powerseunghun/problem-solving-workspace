package Acmicpc.As.B3.TenThousandth.Seven.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeSixNine17614 {
	static int calc(int N) {
		int cnt = 0;
		while (N != 0) {
			if (N%10 == 3 || N%10 == 6 || N%10 == 9) {
				cnt++;
			}
			N /= 10;
		}
		return cnt;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cnt = 0;
		
		for (int i = 1; i <= N; i++) {
			cnt += calc(i);
		}
		
		System.out.println(cnt);
		br.close();
	}
}
