package Acmicpc.Step12;

import java.util.Scanner;

public class CountingSort10989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), min = 10001;
		int[] num = new int[N + 1], sortArray = new int[N + 1];
		int[] numCount = new int[10001], partSum = new int[10001];
		boolean flag = false;
		
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
			if (min > num[i]) min = num[i];
			numCount[num[i]]++;
		}
		for (int i = 0; i < 10001; i++) {
			if (i == 0) {
				partSum[i] = numCount[i];
			}
			else {
				partSum[i] = partSum[i-1] + numCount[i];
			}
		}
		
		for (int i = N - 1; i >= 0; i--) {
			sortArray[partSum[num[i]]] = num[i];
			partSum[num[i]]--;
		}
		
		for (int i = 0; i <= N; i++) {
			if (flag == false && min == sortArray[i]) flag = true;
			if (flag) {
				System.out.println(sortArray[i]);
			}
		}
	}
}
