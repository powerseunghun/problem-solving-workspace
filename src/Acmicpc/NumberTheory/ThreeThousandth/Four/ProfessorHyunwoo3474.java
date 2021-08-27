package Acmicpc.NumberTheory.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProfessorHyunwoo3474 {
	static int getTwoCount(int N) {
		int cnt = 0;
		for (int i = 2; i <= N; i *= 2) {
			cnt += (N/i);
		}
		return cnt;
	}
	static int getFiveCount(int N) {
		int cnt = 0;
		for (int i = 5; i <= N; i*= 5) {
			cnt += (N / i);
		}
		return cnt;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		for (int i = 0, cnt2 = 0, cnt5 = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			cnt2 = getTwoCount(N);
			cnt5 = getFiveCount(N);
			sb.append(Math.min(cnt2, cnt5) + "\n");
		}
		System.out.print(sb.toString());
	}
}
