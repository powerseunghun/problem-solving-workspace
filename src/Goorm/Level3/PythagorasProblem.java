package Goorm.Level3;

import java.io.IOException;

public class PythagorasProblem {
	public static void main(String[] args) throws IOException {
		int c = 0;
		for (int a = 1; ; a++) {
			for (int b = 1; a+b < 1000; b++) {
				c = 1000 - (a + b);
				if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) {
					System.out.println(a*b*c);
					return;
				}
			}
		}
	}
}
