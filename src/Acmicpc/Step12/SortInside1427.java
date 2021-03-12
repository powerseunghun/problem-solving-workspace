package Acmicpc.Step12;

import java.util.Scanner;

public class SortInside1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[10];
		
		while (N != 0) {
			num[N % 10]++;
			N /= 10;
		}
		
		for (int i = num.length-1; i >=0; i--) {
			for (int j = 0; j < num[i]; j++) {
				System.out.print(i);
			}
		}
	}
}
