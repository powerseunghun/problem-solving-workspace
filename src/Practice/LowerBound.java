package Practice;

import java.util.Scanner;

public class LowerBound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), num = 0;
		int[] list = new int[n];
		boolean check = false;
		
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
			if (!check && list[i] >= k) {
				check = true;
				num = i + 1;
			}
		}
		if (check) System.out.println(num);
		else System.out.println(n + 1);
	}
}
