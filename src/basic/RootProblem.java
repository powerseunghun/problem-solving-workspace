package basic;

import java.util.Scanner;

public class RootProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int N = sc.nextInt();
		
		int l = 0, h = 0, lValue = 0, hValue = 0, index = 0; 
		while (l == 0 || h == 0) {
			int tmp = (int) Math.pow(index, N);
			if (tmp <= B) {
				l = 1;
				lValue = index;
			}
			if (tmp >= B) {
				h = 1;
				hValue = index;
			}
			index++;
		}
		
		if (Math.abs(B - (int)Math.pow(lValue, N)) <= Math.abs(B - (int)Math.pow(hValue, N))) {
			System.out.println(lValue);
		}
		else {
			System.out.println(hValue);
		}
	}
}
