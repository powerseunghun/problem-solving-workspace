package basic;

import java.util.Scanner;

public class ForwardBackward {
	public int getDistance(int f, int b, int s) {
		int walk = 0, walkDistance = 0;
		boolean wFlag = true, secondFlag = true;
		while(wFlag) {
			for (int i = 0; i < f; i++) {
				walk++;
				walkDistance++;
				if (walk % s == 0) {
					secondFlag = false;
					break;
				}
			}
			if (!secondFlag) break;
			for (int j = 0; j < b; j++) {
				walk++;
				walkDistance--;
				if (walk % s == 0) {
					wFlag = false;
					break;
				}
			}
		}
		return walkDistance;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,s;
		ForwardBackward fb = new ForwardBackward();
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		s = sc.nextInt();
		
		if (fb.getDistance(a, b, s) > fb.getDistance(c, d, s)) {
			System.out.println("Nikky");
		}
		else if (fb.getDistance(a, b, s) < fb.getDistance(c, d, s)) {
			System.out.println("Byron");
		}
		else {
			System.out.println("Tied");
		}
	}
}
