package Acmicpc.Step16;

import java.util.Scanner;

public class Ring3036 {
	public int getGCD(int a, int b) {
		if (b == 0) return a;
		else return getGCD(b, a % b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), GCD = 0;
		int[] arr = new int[N];
		Ring3036 r = new Ring3036();
		
		arr[0] = sc.nextInt();
		for (int i = 1; i < N; i++) {
			arr[i] = sc.nextInt();
			GCD = r.getGCD(arr[0], arr[i]);
			
			System.out.println(arr[0] / GCD + "/" + arr[i] / GCD);
		}
	}
}
