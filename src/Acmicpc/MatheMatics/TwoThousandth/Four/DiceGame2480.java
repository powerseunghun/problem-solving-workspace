package Acmicpc.MatheMatics.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class DiceGame2480 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int max = 0, price = 0, same = 0, maxNum = 0;
		Set<Integer> set = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			maxNum = Math.max(val, maxNum);
			if (set.contains(val)) same = val;
			set.add(val);
		}
		switch(set.size()) {
		case 3:
			price = maxNum * 100;
			break;
		case 2:
			price = 1000 + same * 100;
			break;
		case 1:
			price = 10000 + same * 1000;
			break;
		}
		max = Math.max(price, max);
		System.out.println(max);
	}
}
