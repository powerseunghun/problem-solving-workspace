package basic;

import java.util.Scanner;

public class CodeName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println(new StringBuffer(sc.nextLine()).reverse().toString());
		}
	}
}
