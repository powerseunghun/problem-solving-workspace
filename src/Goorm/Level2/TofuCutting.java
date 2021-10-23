package Goorm.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TofuCutting {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0;
		// ex) N == 7  ret -> 4
		// 6 (x)  5 - 5, 1, 1(1-cut)
		// 4 - 4, 2, 1 (1-cut) 4, 3(1-cut) 4, 1, 1, 1 (1-cut)
		// 3 - 3, 3, 1 (2-cut), 3, 2, 2 (1-cut), 3, 2, 1, 1(1-cut)
		// 2 - 2, 2, 2, 1(3-cut) 2, 2, 1, 1, 1  (2-cut)
		// 1 - 1, 1, 1, 1, 1, 1, 1 (7-cut)  4가지
		if (N <= 3) System.out.println(N-1);
		else System.out.println(N-3);
		
		System.out.println(count);
	}
}
