package Practice;

import java.util.Scanner;

public class SelfNumber {
	public int getNumber(int n) {
		if (n == 0) return 0;
		else return (n % 10) + getNumber(n / 10);
	}
	public int getDn(int n) {
		return n + getNumber(n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SelfNumber sn = new SelfNumber();
		int a = sc.nextInt(), b = sc.nextInt(), sum = 0;
		int[] list = new int[b + 1];
		
		for (int i = 1; i < list.length; i++) {
			int tmp = sn.getDn(i);
			if (tmp <= b) {
				list[tmp] = 1;
			}
		}
		
		for (int i = a; i <= b; i++) {
			System.out.println(i + " : " + list[i]);
			if (list[i] == 0) sum += i;
		}
		
		System.out.println(sum);
	}
}
