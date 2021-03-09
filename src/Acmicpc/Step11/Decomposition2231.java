package Acmicpc.Step11;

import java.util.Scanner;

public class Decomposition2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), tmp = N;
		int count = 0, sum = 0;
		boolean flag = false;
		while (tmp != 0) {
			count++;
			tmp /= 10;
		}
		
		for (int i = N - (count * 9); i <= N; i++) {
			sum = 0;
			tmp = i;
			while (tmp != 0) {
				sum += tmp % 10;
				tmp /= 10;
			}
			
			if (sum + i == N) {
				flag = true;
				System.out.println(i);
				break;
			}
		}
		if (!flag) System.out.println(0);
	}
}
