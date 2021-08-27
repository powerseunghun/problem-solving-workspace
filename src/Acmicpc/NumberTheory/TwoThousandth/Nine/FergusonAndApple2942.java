package Acmicpc.NumberTheory.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class FergusonAndApple2942 {
	static long GCD(long a, long b) {
		if (b%a == 0) return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		ArrayList<Integer> list = new ArrayList<>();
		long R = Integer.parseInt(tmp.split(" ")[0]);
		long G = Integer.parseInt(tmp.split(" ")[1]);
		long gcd = GCD(R, G);
		
		for (int i = 1; i <= Math.sqrt(gcd); i++) {
			if (gcd % i == 0) {
				if (i * i == gcd) list.add(i);
				else {
					list.add(i);
					list.add((int)(gcd/i));
				}
			}
		}
		Collections.sort(list);
		for (int i = 0, val = 0; i < list.size(); i++) {
			val = list.get(i);
			sb.append(val + " " + (R/val) + " " + (G/val) + "\n");
		}
		
		System.out.print(sb.toString());
	}
}
