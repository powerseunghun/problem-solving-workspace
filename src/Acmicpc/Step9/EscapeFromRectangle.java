package Acmicpc.Step9;

import java.util.Scanner;

public class EscapeFromRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, w, h, tmp1, tmp2, answer;
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		tmp1 = Math.abs(w - x) >= Math.abs(0 - x) ? Math.abs(0 - x) : Math.abs(w - x);
		tmp2 = Math.abs(h - y) >= Math.abs(0 - y) ? Math.abs(0 - y) : Math.abs(h - y);
		
		answer = tmp1 >= tmp2 ? tmp2 : tmp1;
		System.out.println(answer);
	}
}
