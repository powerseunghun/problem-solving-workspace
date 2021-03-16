package test;

import java.util.Scanner;

public class Test {
	public int getCount(int n) {
		int sum = 0, i = 0;
		for (i = 0;; i++) {
			if (sum >= n) {
				break;
			}
			sum += 9 * Math.pow(10, i);
		}
		return i;
	}
	
	public int getDiff(int n) {
		int sum = 0, i;
		for (i = 0;; i++) {
			if (sum >= n) {
				break;
			}
			sum += 9 * Math.pow(10, i);
		}
		sum -= 9 * Math.pow(10, i - 1);
		
		return n - sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = new Test().getCount(n);
		int diff = new Test().getDiff(n);
		
		System.out.println(count);
		System.out.println(diff);
	}
}
