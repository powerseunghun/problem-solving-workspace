package basic;

import java.util.Scanner;

public class LinearStructureSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int index = -1;
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (k == num[i]) {
				index = i + 1;
				break;
			}
		}
		
		System.out.println(index);
	}
}
