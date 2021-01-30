package basic;

import java.util.Scanner;

public class ThreeNumberGCD {
	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		else {
			return gcd(b, a % b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ThreeNumberGCD tg = new ThreeNumberGCD();
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println(tg.gcd(a, tg.gcd(b, c)));
	}
}
