package Acmicpc.As.B5.TwentyThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tax20492 {
	static int case1(int N) {
		return N - ((N / 100) * 22);
	}
	static int case2(int N) {
		return N - (N/5 / 100 * 22);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(case1(N) + " " + case2(N));
		br.close();
	}
}
