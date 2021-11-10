package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RightTruncatablePrime {
	static List<Long> rTruncPrime = new ArrayList<>();
	static boolean check(long N) {
		if (N < 2) return false;
		
		for (int i = 2; i*i <= N; i++) {
			if (N % i == 0) return false;
		}
		return true;
	}
	static void search(long N, int d, int l) {
		if (d >= l) {
			if (check(N)) rTruncPrime.add(N);
			return;
		}
		if (check(N)) {
			search(N*10+1, d+1, l);
			search(N*10+3, d+1, l);
			search(N*10+7, d+1, l);
			search(N*10+9, d+1, l);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int l = Integer.parseInt(br.readLine());
		int[] start = {2, 3, 5, 7};
		
		for (int i = 0; i < start.length; i++) {
			search(start[i], 1, l);
		}
		
		Collections.sort(rTruncPrime);
		
		for (int i = 0; i < rTruncPrime.size(); i++) {
			sb.append(rTruncPrime.get(i) + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
