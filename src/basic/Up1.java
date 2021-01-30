package basic;

import java.util.Scanner;

public class Up1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char house = sc.next().charAt(0);
		int floor = house == 'A' ? 10 : house == 'S' ? 2 : 1;
		int t = sc.nextInt(), x = sc.nextInt();
		int m = sc.nextInt(), c = sc.nextInt();
		int w = sc.nextInt(), ballon = 0;
		
		ballon = ((x * floor) / w) + 1 + t;
		
		if (ballon * c <= m) System.out.println("Yes");
		else System.out.println("No");
	}
}
