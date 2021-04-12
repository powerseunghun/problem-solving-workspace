package Acmicpc.Step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeafYear2753 {
	static boolean checkLeafYear(int year) {
		return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)); 
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		if (checkLeafYear(Integer.parseInt(br.readLine()))) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}
