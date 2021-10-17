package test;

import java.util.HashSet;
import java.util.Set;

public class FTest {
	public static void main(String[] args) {
		int[][] ballons = {{2,2},{4,4},{1,4},{-1,-4},{0,4},{0,-4},{4,0},{-4,0}};
		double m = 0;
		m = 4/2;
		System.out.println(4/2);
		Set<Integer> set = new HashSet<>();
		int x = 0, y = 0;
		for (int i = 0; i < ballons.length; i++) {
			x = ballons[i][0];
			y = ballons[i][1];
			// 1
			if (x > 0 && y > 0) {
				System.out.println("1사분면");
			}
			else if (x < 0 && y > 0) {
				System.out.println("2사분면");
			}
			else if (x <0 && y < 0) {
				System.out.println("3사분면");
			}
			else if (x > 0 && y < 0) {
				System.out.println("4사분면");
			}
			else {
				//x, y,0 포함
				if (x == 0) {
					if (y > 0) {
						System.out.println("x : " + x + ", y : " + y);
						System.out.println("x 는 0이면서 y는 양수");
					}
					else {
						System.out.println("x : " + x + ", y : " + y);
						System.out.println("x는 0이면서 y는 음수");
					}
				}
				else if (y == 0) {
					if (x > 0) {
						System.out.println("x : " + x + ", y : " + y);
						System.out.println("y는 0이면서 x는 양수");
					}
					else {
						System.out.println("x : " + x + ", y : " + y);
						System.out.println("y는 0이면서 x는 음수");
					}
				}
			}
		}
	}
}
