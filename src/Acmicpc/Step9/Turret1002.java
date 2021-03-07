package Acmicpc.Step9;

import java.util.Scanner;

public class Turret1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		double dist = 0.0;
		int x1 = 0, y1 = 0, r1 = 0, x2 = 0 ,y2 = 0, r2 = 0;
		for (int i = 0; i < T; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			
			dist = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
			
			if (dist == 0 && r1 == r2) {
				System.out.println(-1);
			}
			else if (dist > (r1 + r2)) {
				System.out.println(0);
			}
			else if (dist < Math.abs(r1 - r2)) {
				System.out.println(0);
			}
			else if (dist == Math.abs(r1 - r2)) {
				System.out.println(1);
			}
			else if (dist == (r1 + r2)) {
				System.out.println(1);
			}
			else System.out.println(2);
		}
	}
}
