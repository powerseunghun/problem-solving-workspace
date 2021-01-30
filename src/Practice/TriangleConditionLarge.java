package Practice;

import java.util.Scanner;

public class TriangleConditionLarge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;
		
		for (int a = 0; a <= n/2; a++) {
			for (int b = 0; b <= n/3; b++) {
				int c = n - (a + b);
				if (a < (b + c) && b <= c && c <= a) count++;
			}
		}
		System.out.println(count);
	}
}
