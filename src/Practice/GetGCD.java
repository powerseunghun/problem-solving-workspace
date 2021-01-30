package Practice;

import java.util.Scanner;

public class GetGCD {
	public int gcd(int a, int b) {
		if (b == 0) return a;
		else return gcd(b, a % b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(new GetGCD().gcd(a, b));
	}
}
