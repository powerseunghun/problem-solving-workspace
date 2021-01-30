package basic;

import java.util.Scanner;

public class CollatzConjecture {
	public int Conjecture(int n) {
		int count = 1;
		while(n != 1) {
			count++;
			n = n % 2 == 0 ? n / 2 : 3 * n + 1;
		}
		
		return count;
	}
	public static void main(String[] args) {
		CollatzConjecture c = new CollatzConjecture();
		Scanner sc = new Scanner(System.in);
		int a, b, min = 10001, maxLength = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		
		for (int i = a; i <= b; i++) {
			if (c.Conjecture(i) > maxLength) {
				min = i;
				maxLength = c.Conjecture(i);
			}
		}
		
		System.out.println(min + " " + maxLength);
	}
}
