package Codeforce.OrderSubmit.TwoHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetyaAndStrings {
	static int formal(String str1, String str2) {
		if (str1.compareTo(str2) < 0) return -1;
		else if (str1.compareTo(str2) > 0) return 1;
		else return 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine().toUpperCase();
		String str2 = br.readLine().toUpperCase();
		
		System.out.println(formal(str1, str2));
		br.close();
	}
}
