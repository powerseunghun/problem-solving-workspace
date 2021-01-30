package basic;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[1000];
		int n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i = 1 ; i < 11; i++) {
			System.out.println(a[i]);
		}
	}
}
