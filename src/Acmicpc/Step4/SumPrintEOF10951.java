package Acmicpc.Step4;

import java.util.Scanner;

public class SumPrintEOF10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}
}
