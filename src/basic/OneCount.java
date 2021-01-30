package basic;

import java.util.Scanner;

public class OneCount {
	public int getCount(int n) {
		int count = 0;
		while (n != 0) {
			if (n % 10 == 1) {
				count++;
			}
			n /= 10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), count = 0;
		OneCount oc = new OneCount();
		
		for (int i = a; i <= b; i++) {
			count += oc.getCount(i);
		}
		System.out.println(count);
	}
}
