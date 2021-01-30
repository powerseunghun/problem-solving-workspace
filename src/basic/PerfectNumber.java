package basic;

import java.util.Scanner;

public class PerfectNumber {
	public boolean isPerfect(int n) {
		boolean isPerfect = true;
		int sum = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i == Math.sqrt(n)) {
					sum += i;
				}
				else {
					sum += i;
					sum += (n / i);
				}
			}
		}
		sum -= n;
		if (sum == n) return isPerfect;
		else return !isPerfect;
		
	}
	public static void main(String[] args) {
		PerfectNumber pn = new PerfectNumber();
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			if (pn.isPerfect(numbers[i])) {
				System.out.println("yes");
			}
			else System.out.println("no");
		}
	}
}
