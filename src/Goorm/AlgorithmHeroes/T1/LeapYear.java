package Goorm.AlgorithmHeroes.T1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeapYear {
	static String isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
			return "Leap Year";
		}
		else return "Not Leap Year";
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		System.out.println(isLeapYear(Integer.parseInt(input)));
		br.close();
	}
}
