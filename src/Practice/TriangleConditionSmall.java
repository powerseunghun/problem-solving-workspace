package Practice;

import java.util.Scanner;

public class TriangleConditionSmall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;
		
		for (int a = 0; a <= n; a++) {
			for (int b = 0; b <= n; b++) {
				for (int c = 0; c <= n; c++) {
					if (a <= b && b <= c && ((a + b) > c) && a + b + c == n) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
