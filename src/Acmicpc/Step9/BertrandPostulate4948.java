package Acmicpc.Step9;

import java.util.Scanner;

public class BertrandPostulate4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, count = 0;
		int[] arr = null;
		
		while (true) {
			n = sc.nextInt();
			if (n == 1) {
				System.out.println(1);
				continue;
			}
			if (n == 0) break;
			
			arr = new int[n * 2 + 1];
			for (int i = 2; i * i <= n * 2; i++) {
				for (int j = i * i; j <= n * 2; j+= i) {
					arr[j] = 1;
				}
			}
			count = 0;
			for (int i = n + 1; i <= n * 2; i++) {
				if (arr[i] == 0) count++;
			}
			System.out.println(count);
		}
	}
}
