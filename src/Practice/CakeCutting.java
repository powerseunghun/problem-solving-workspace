package Practice;

import java.util.Scanner;

public class CakeCutting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		boolean cross = false;
		if ((c > a && c < b) && (!(d > a && d < b))) {
			cross = true;
		}
		if ((d > a && d < b) && (!(c > a && c < b))) {
			cross = true;
		}
		if ((c > b && c < a) && (!(d > b && d < a))) {
			cross = true;
		}
		if ((d > b && d < a) && (!(c > b && c < a))) {
			cross = true;
		}
		if (cross) System.out.println("cross");
		else System.out.println("not cross");
	}
}
