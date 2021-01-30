package Practice;

import java.util.Scanner;

public class CirculationString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "", s2 = "", s3 = "";
		s1 = sc.next(); s2 = sc.next(); s3 = sc.next();
		
		if (s1.charAt(s1.length()-1) == s2.charAt(0) 
				&& s2.charAt(s2.length() - 1) == s3.charAt(0) && 
				s3.charAt(s3.length() - 1) == s1.charAt(0)) {
			System.out.println("good");
		}
		else {
			System.out.println("bad");
		}
	}
}
