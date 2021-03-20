package Acmicpc.Step15;

import java.util.Arrays;
import java.util.Scanner;

public class ATM11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), sum = 0;
		int[] times = new int[N];
		
		for (int i = 0; i < N; i++) {
			times[i] = sc.nextInt();
		}
		Arrays.sort(times);
		sum += times[0];
		for (int i = 1; i < N; i++) {
			times[i] += times[i-1];
			sum += times[i];
		}
		System.out.println(sum);
	}
}
