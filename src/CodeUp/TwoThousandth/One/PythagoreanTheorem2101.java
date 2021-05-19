package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PythagoreanTheorem2101 {
	static int getDivisorCount(long a) {
		long lv = (long) Math.sqrt(a * a);
		int count = 0;
		long b = 0, c = 0;
		ArrayList<Long> list = new ArrayList<Long>();
		for (long i = 1; i <= lv; i++) {
			if ((a * a) % i == 0) {
				if(i == lv) {
					list.add(i);
				}
				else {
					list.add(i);
					list.add((a * a) / i);
				}
			}
		}
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				long tmp1 = list.get(i);
				long tmp2 = list.get(j);
				if ((a * a) == tmp1 * tmp2) {
					if ((tmp1 + tmp2) % 2 == 0)
					c = (tmp1 + tmp2) / 2;
					b = tmp1 >= tmp2 ? tmp1 - c : tmp2 - c;
					if ((tmp1 + tmp2) % 2 == 0 && b > a) count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(getDivisorCount(Long.parseLong(br.readLine())));
	}
}
