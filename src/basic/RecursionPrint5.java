package basic;

import java.util.Scanner;

public class RecursionPrint5 {
	public void print(int n) {
		if (n <= 0) return;
		print(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		new RecursionPrint5().print(new Scanner(System.in).nextInt());
	}
}
