package Practice;

import java.util.Scanner;

public class OneDimensionDifferenceArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int s = 0, e = 0, u = 0, sum = 0;
		int[] arr = new int[n];
		
		for (int i = 0; i < m; i++) {
			s = sc.nextInt(); e = sc.nextInt(); u = sc.nextInt();
			arr[s - 1] += u;
			arr[e] -= u;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j <= i; j++) {
				sum += arr[j];
			}
			System.out.print(sum + " ");
		}
	}
}
