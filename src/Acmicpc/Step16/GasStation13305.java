package Acmicpc.Step16;

import java.util.Scanner;

public class GasStation13305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long sum = 0, min = 1000000001;
		long[] city = new long[N], dist = new long[N-1];
		
		for (int i = 0; i < N-1; i++) {
			dist[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			city[i] = sc.nextInt();
		}
		
		for (int i = 0; i < city.length-1; i++) {
			if (city[i] <= min) {
				min = city[i];
			}
			else {
				city[i] = min;
			}
			sum += (min * dist[i]);
		}
		System.out.println(sum);
	}
}
