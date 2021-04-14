package Acmicpc.Step6;

import java.util.Arrays;

public class SelfNumber4673 {
	static int getSelfNumber(int n) {
		int sum = n;
		
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int tmp = 0;
		boolean[] ns = new boolean[10001];
		Arrays.fill(ns, false);
		
		for (int i = 1; i < ns.length; i++) {
			tmp = getSelfNumber(i);
			if (tmp < ns.length) {
				ns[tmp] = true;
			}
		}
		
		for (int i = 1; i < ns.length; i++) {
			if (!ns[i]) {
				System.out.println(i);
			}
		}
	}
}
