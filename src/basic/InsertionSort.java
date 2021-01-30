package basic;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int key = 0, temp = 0, j;
		int[] a = new int[10001];
		
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 2; i <= n; i++) {
			key = a[i];
			for (j = i - 1; j > 0 && a[j] > key; j--) {
				a[j + 1] = a[j];
			}
			a[j+1] = key;
		}
		
		for (int i = 1; i <=n; i++) {
			System.out.println(a[i]);
		}
	}
}
