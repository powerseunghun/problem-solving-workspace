package Goorm.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Diamond {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), space = N/2, star = 1;
		
		for (int i = 0; i < (N%2!=0 ? N/2+1 : N/2); i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			space -= 1;
			star += 2;
			System.out.println();
		}
		
		space = 1;
		star = N % 2 != 0 ? star-4 : star-2;
		
		for (int i = 0; i < N/2; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
			space += 1;
			star -= 2;
		}
	}
}
