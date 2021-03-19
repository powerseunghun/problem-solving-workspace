package Acmicpc.Step14;

import java.util.Scanner;

public class GrapeWineTasting2156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), maxValue = 0;
		// n+1 == 97% ArrayIndexOutOfBounds 이유 못찾음 
		int[] arr = new int[n+3], tastingSum = new int[n+3];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		tastingSum[1] = arr[1];
		tastingSum[2] = arr[1] >= (arr[1] + arr[2]) ? arr[1] : (arr[1] + arr[2]);
		
		for (int i = 3; i <= n; i++) {
			maxValue = Math.max(tastingSum[i-1], Math.max(tastingSum[i-2] + arr[i], tastingSum[i-3] + arr[i-1] + arr[i]));
			tastingSum[i] = maxValue; 
		}
		
		System.out.println(tastingSum[n]);
	}
	
}
