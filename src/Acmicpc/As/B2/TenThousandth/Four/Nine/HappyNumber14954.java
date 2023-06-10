package Acmicpc.As.B2.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber14954 {
	static Set<Integer> set = new HashSet<>();
	static int func(int N) {
		int res = 0;
		while (N != 0) {
			res += Math.pow(N%10, 2);
			N /= 10;
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0;
		set.add(N);
		
		while (N != 1) {
			N = func(N);
			if (set.contains(N)) break;
			set.add(N);
		}
		
		System.out.println(N == 1 ? "HAPPY" : "UNHAPPY");
		br.close();
	}
}
