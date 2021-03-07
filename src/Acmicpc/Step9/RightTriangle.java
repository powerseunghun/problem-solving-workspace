package Acmicpc.Step9;

import java.util.ArrayList;
import java.util.Scanner;

public class RightTriangle {
	public static void main(String[] args) {
		int max = 0, a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if (a == 0 && b == 0 && c == 0) break;
			max = (a >= b) ? (a >= c) ? a : c : (b >= c) ? b : c;
			
			if (max == a) {
				if(Math.sqrt((b * b) + (c * c)) == a) {
					System.out.println("right");
				}
				else {
					System.out.println("wrong");
				}
			}
			else if (max == b) {
				if(Math.sqrt((a * a) + (c * c)) == b) {
					System.out.println("right");
				}
				else {
					System.out.println("wrong");
				}
			}
			else {
				if (Math.sqrt((a * a) + (b * b)) == c) {
					System.out.println("right");
				}
				else {
					System.out.println("wrong");
				}
			}
		}
	}
}
