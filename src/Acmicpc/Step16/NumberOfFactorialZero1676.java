package Acmicpc.Step16;

import java.util.Scanner;

public class NumberOfFactorialZero1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), countTwo = 0, countFive = 0;
		int tmp = 0;
		for (int i = 1; i <= N; i++) {
			tmp = i;
			while (tmp % 2 == 0) {
				countTwo += 1;
				 tmp /= 2;
			}
			
			while (tmp % 5 == 0) {
				countFive += 1;
				tmp /= 5;
			}
		}
		System.out.println(Math.min(countTwo, countFive));
	}
}
