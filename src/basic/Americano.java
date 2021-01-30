package basic;

import java.util.Scanner;

public class Americano {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coffee = 0;
		int k= sc.nextInt(), n = sc.nextInt();
		
		while(k >= n) {
			coffee += k / n;
			k = (k % n) + (k / n);
		}
		System.out.println(coffee);
	}
}
