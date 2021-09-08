package SWExpertAcademy.D3.TenThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerPalindromeNumber10570 {
	static boolean isPalin(int N) {
		String tmp = N + "";
		for (int i = 0, j = tmp.length()-1; j >= i; i++, j--) {
			if (tmp.charAt(i) != tmp.charAt(j)) return false;
		}
		return true;
	}
	static boolean check(int N) {
		double tmp = Math.sqrt(N);
		if (tmp != (int)tmp) return false;
		if (isPalin(N) && isPalin((int)tmp)) return true;
		return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), A = 0, B = 0, cnt = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			cnt = 0;
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			for (int j = A; j <= B; j++) {
				if (check(j)) cnt++;
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
