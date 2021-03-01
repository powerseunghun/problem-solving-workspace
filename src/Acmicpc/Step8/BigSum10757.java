package Acmicpc.Step8;

import java.util.Scanner;

public class BigSum10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A, B, sum;
		int carry = 0, baseLength = 0, idx = 0;
		String tmp = sc.nextLine();
		String s1 = tmp.split(" ")[0];
		String s2 = tmp.split(" ")[1];
		baseLength = s1.length() >= s2.length() ? s1.length() : s2.length();
		A = new int[baseLength]; B = new int[baseLength];
		sum = new int[baseLength];
		
		idx = A.length - 1;
		for (int i = s1.length() - 1; i >= 0; i--) {
			A[idx--] = s1.charAt(i) - 48;
		}
		idx = B.length - 1;
		for (int i = s2.length() - 1; i >= 0; i--) {
			B[idx--] = s2.charAt(i) - 48;
		}
		
		for (int i = baseLength-1; i >= 0; i--) {
			int temp = A[i] + B[i] + carry;
			if (i == 0) {
				sum[i] = temp;
			}
			else {
				if (temp >= 10) {
					carry = (A[i] + B[i] + carry) / 10;
				}
				else {
					carry = 0;
				}
				sum[i] = temp % 10;
			}
		}
		
		for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i]);
		}
	}
}
