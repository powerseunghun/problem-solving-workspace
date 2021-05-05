package CodeUp.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParallelogramPrint1368 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int h = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		char c = tmp.split(" ")[2].charAt(0);
		
		switch(c) {
		case 'L':
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < k; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 'R':
			for (int i = 0; i < h; i++) {
				for (int j = h-1; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j < k; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		}
	}
}
