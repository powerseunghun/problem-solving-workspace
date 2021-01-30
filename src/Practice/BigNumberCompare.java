package Practice;

import java.util.Scanner;

public class BigNumberCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = 0, b = 0, index = 0;
		double max = 0;
		
		for (int i = 0; i < n; i++) {
			a = sc.nextInt(); b = sc.nextInt();
			if ((b * Math.log(a)) > max) {
				max = b * Math.log(a);
				index = i + 1;
			}
		}
		
		System.out.println(index);
	}
}
