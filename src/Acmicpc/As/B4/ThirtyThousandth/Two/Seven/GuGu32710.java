package Acmicpc.As.B4.ThirtyThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GuGu32710 {
	static final int s = 2, e = 9;
	static Set<Integer> set = new HashSet<>();
	static void init() {
		for (int i = s; i <= e; i++) {
			for (int j = s-1; j <= e; j++) {
				set.add(i);
				set.add(j);
				set.add(i*j);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		init();
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(set.contains(N) ? "1" : "0");
		br.close();
	}
}
