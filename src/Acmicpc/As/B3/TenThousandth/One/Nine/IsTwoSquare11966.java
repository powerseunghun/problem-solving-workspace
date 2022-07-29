package Acmicpc.As.B3.TenThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsTwoSquare11966 {
	static boolean isSquare(int N) {
		for (int i = 1; i <= 30; i++) {
			if (Math.pow(2, i) == N) return true;
		}
		return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(N == 1 ? 1 : isSquare(N) ? 1 : 0);
		br.close();
	}
}
