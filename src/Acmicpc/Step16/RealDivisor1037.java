package Acmicpc.Step16;

import java.util.Arrays;
import java.util.Scanner;

public class RealDivisor1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(), N = 0;
		int[] arr = new int[T];
		
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		switch(T % 2) {
		case 0:
			N = arr[T/2-1] * arr[T/2];
			break;
		case 1:
			N = arr[T/2] * arr[T/2];
			break;
		}
		System.out.println(N);
	}
}
