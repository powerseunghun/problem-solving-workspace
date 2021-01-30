package basic;

import java.util.Scanner;

public class RecursionCombination {
	public int combination(int n, int r) {
		if (n == r || r == 0) {
			return 1;
		}
		else {
			return combination(n-1, r-1) + combination(n-1, r);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(new RecursionCombination().combination(sc.nextInt(), sc.nextInt()));
	}
}
