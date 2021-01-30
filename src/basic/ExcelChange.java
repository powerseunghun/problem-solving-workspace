package basic;

import java.util.Scanner;

public class ExcelChange {
	public void getAlpha(int n) {
		if (n < 1) return;
		else {
			getAlpha((n-1) / 26);
			System.out.print((char)(((n-1) % 26) + 65));
		}
	}
	public static void main(String[] args) {
		ExcelChange t = new ExcelChange();
		t.getAlpha(new Scanner(System.in).nextInt());
	}
}
