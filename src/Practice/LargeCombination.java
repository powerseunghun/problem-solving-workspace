package Practice;

import java.util.Scanner;

public class LargeCombination {
	public int combination(int n, int r) {
		if (n == r || r == 0) return 1;
		else return combination(n-1, r-1) + combination(n-1, r);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LargeCombination lc = new LargeCombination();
		int n = sc.nextInt(), k = sc.nextInt();
		
		System.out.println(lc.combination(n, k));
	}
}
