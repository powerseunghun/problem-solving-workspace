package CodeUp.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RhombusPrint3122 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int space = n-1, star = 1;
		
		for (int i = 0; i < n; i++, star += 2, space--) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		space += 2; star -= 4;
		
		for (int i = 0; i < n-1; i++, star -= 2, space++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
