package basic;

import java.util.Scanner;

public class ExcelChange2 {
	public int getNumber(String s) {
		int sum = 0, pow = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			sum += Math.pow(26, pow) * (s.charAt(i) - 64);
			pow++;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(new ExcelChange2().getNumber(new Scanner(System.in).nextLine()));
	}
}
