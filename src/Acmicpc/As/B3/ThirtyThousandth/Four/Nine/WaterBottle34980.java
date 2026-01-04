package Acmicpc.As.B3.ThirtyThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterBottle34980 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Good");
		} else {
			str1 = str1.replaceAll("[^w]", "");
			str2 = str2.replaceAll("[^w]", "");
			
			if (str1.length() == str2.length()) {
				System.out.println("Its fine");
			} else if (str1.length() < str2.length()) {
				System.out.println("Manners maketh man");
			} else {
				System.out.println("Oryang");
			}
		}
		br.close();
	}
}
