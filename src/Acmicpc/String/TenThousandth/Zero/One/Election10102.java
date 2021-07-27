package Acmicpc.String.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Election10102 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int countA = 0, countB = 0;
		br.readLine();
		String s = br.readLine();
		
		for (int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'A':
				countA++;
				break;
			case 'B':
				countB++;
				break;
			}
		}
		
		if (countA > countB) {
			System.out.println("A");
		}
		else if (countA < countB) {
			System.out.println("B");
		}
		else System.out.println("Tie");
	}
}
