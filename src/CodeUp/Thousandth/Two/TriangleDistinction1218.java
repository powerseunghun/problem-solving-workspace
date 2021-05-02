package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleDistinction1218 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int c = Integer.parseInt(tmp.split(" ")[2]);
		int max = a >= b ? a >= c ? a : c : b >= c ? b : c;
		boolean flag = true;
		
		if (max == a) {
			if ((b + c) > a) flag = true;
			else flag = false;
		}
		else if (max == b) {
			if ((a + c) > b) flag = true;
			else flag = false;
		}
		else {
			if ((a + b) > c) flag = true;
			else flag = false;
		}
		if (flag) {
			if (a == b && b == c) {
				System.out.println("정삼각형");
			}
			else if (a == b || b == c) {
				System.out.println("이등변삼각형");
			}
			else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
				System.out.println("직각삼각형");
			}
			else {
				System.out.println("삼각형");
			}
		}
		else {
			System.out.println("삼각형아님");
		}
	}
}
