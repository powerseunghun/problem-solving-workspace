package Practice;

import java.util.Scanner;

public class CountingSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 0;
		int[] A = new int[n], B = new int[n];
		
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			if(A[i] > max) {
				max = A[i];
			}
		}
		int[] C = new int[max + 1];
		for (int i = 0; i < A.length; i++) {
			C[A[i]]++;
		}
		for (int i = 1; i < C.length; i++) {
			C[i] += C[i - 1];
		}
		
		for (int i = 0; i < A.length; i++) {
			B[C[A[i]] - 1] = A[i];
			C[A[i]]--;
		}
		
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i] + " ");
		}
		
//		for (int i = 0; i <= max; i++) {
//			for (int j = 0; j < C[i]; j++) {
//				System.out.print(i + " ");
//			}
//		}
				
	}
}
