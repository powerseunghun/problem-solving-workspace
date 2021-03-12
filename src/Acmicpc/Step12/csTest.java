package Acmicpc.Step12;

import java.util.Scanner;

public class csTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = 0;
		int[] A = new int[1001], B = new int[1001], count = new int[10001], countSum = new int[10001];
		
		N = sc.nextInt();
		
		for (int i = 0; i <= N; i++) {
			A[i] = sc.nextInt();
			
			count[A[i]]++;
		}
		
		countSum[0] = count[0];
		
		for (int i = 1; i <= 10000; i++) {
			countSum[i] = countSum[i-1] + count[i];
		}
		
		for (int i = N; i >= 1; i--) {
			B[countSum[A[i]]] = A[i];
			countSum[A[i]]--;
		}
		
		for (int i = 1; i<= N; i++) {
			System.out.print(B[i] + " ");
		}
	}
}
