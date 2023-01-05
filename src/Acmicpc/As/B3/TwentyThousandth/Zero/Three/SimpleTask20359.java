package Acmicpc.As.B3.TwentyThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SimpleTask20359 {
	static Set<Integer> set = new HashSet<>();
	static void setInit() {
		for (int i = 1, val = 0; ; i++) {
			val = (int) Math.pow(2, i);
			if (val > 1000000) break;
			set.add(val);
		}
	}
	static int getP(int N) {
		for (int i = 2; ; i++) {
			if ((double)N/i == (int)(N/i) && (set.contains(N/i))) {
				return i;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), p = 0;
		setInit();
		
		p = getP(N);
		System.out.println((int)(N/Math.pow(2, p)) + " " + p);
		br.close();
	}
}
