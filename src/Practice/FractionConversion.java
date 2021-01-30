package Practice;

import java.util.Scanner;

public class FractionConversion {
	public int getGCD(int a, int b) {
		if (b ==0) return a;
		else return getGCD(b, a % b);
	}
	public static void main(String[] args) {
		double m = new Scanner(System.in).nextDouble() * 10;
		int gcd = new FractionConversion().getGCD((int)m, 1000);
		
		System.out.println((int)(m / gcd) + "/" + (1000 / gcd));
	}
}
