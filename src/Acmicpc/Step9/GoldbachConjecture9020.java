package Acmicpc.Step9;

import java.util.Scanner;

public class GoldbachConjecture9020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, n, a, b;
		int[] arr = null;
		
		T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			n = sc.nextInt();
			a = n / 2;
			b = n / 2;
			arr = new int[n + 1];
			
			for (int j = 2; j <= Math.sqrt(n); j++) {
				for (int k = j * j; k <= n; k += j) {
					arr[k] = 1;
				}
			}
			
			while(true) {
				if ((arr[a] == 0 && arr[b] == 0) && a + b == n) {
					System.out.println(a + " " + b);
					break;
				}
				else {
					a--;
					b++;
				}
			}
		}
	}
}
