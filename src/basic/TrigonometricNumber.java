package basic;

import java.util.Scanner;

public class TrigonometricNumber {
//	public int getDivisorCount(int n, int d, int c) {
//		int count = c;
//		if (n < d) return count;
//		else {
//			if (n % d == 0) count++;
//			return getDivisorCount(n, d+1, count);
//		}
//	}
	public int getDivisorCount(int n) {
		int count = 0, i;
		for (i = 1; i * i < n; i++) {
			if (n % i == 0) {
				count += 2;
			}
		}
		if (i * i == n) count++;
		return count;
	}
	public static void main(String[] args) {
		int k = new Scanner(System.in).nextInt(), bn = 0, pn = 1, n = 0;
		TrigonometricNumber tn = new TrigonometricNumber();
		while(true) {
			if (tn.getDivisorCount(bn + pn) > k) {
				break;
			}
			bn = bn + pn;
			pn++;
		}
		System.out.println(bn + pn);
	}
}
