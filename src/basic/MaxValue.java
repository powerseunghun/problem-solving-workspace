package basic;

import java.util.Scanner;

public class MaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int max = 0, maxIndex = 1;
		for (int i = 0 ; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		max = num[0];
		
		for (int i = 1; i < num.length; i++) {
			if (num[i] >= max) {
				max = num[i];
				maxIndex = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(maxIndex);
	}
}
