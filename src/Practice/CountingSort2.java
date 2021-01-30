package Practice;

import java.util.Scanner;

public class CountingSort2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 0, input = 0;
		int[] A = new int[100001];
		
		for (int i = 0; i < n; i++) {
			input = sc.nextInt();
			A[input]++;
			if (input > max) {
				max = input;
			}
		}
		
		for (int i = 0; i <= max; i++) {
			for (int j = 0; j < A[i]; j++) {
				System.out.print(i + " ");
			}
		}
	}
}
