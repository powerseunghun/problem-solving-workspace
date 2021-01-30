package Practice;

import java.util.Scanner;

public class MakeSNS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), femaleCount = 0, maleCount = 0;
		String s = "";
		
		for (int i = 0; i < n; i++) {
			s = sc.next();
			if (s.split(",")[1].equals("F")) {
				femaleCount++;
			}
			else {
				maleCount++;
			}
		}
		System.out.println(maleCount);
		System.out.println(femaleCount);
	}
}
