package basic;

import java.util.Scanner;

public class RecursionOddPrint {
//	a = min, b = max
	public void print(int a, int b) {
		if (b < a) return;
		else {
			print(a, b-1);
			if (b % 2 != 0) {
				System.out.print(b + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RecursionOddPrint rod = new RecursionOddPrint();
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a >= b) {
			rod.print(b, a);
		}
		else {
			rod.print(a, b);
		}
	}		
}
