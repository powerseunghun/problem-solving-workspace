package basic;

import java.util.Scanner;

public class CheckBoardPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, h, w2, h2;
		w = sc.nextInt();
		h = sc.nextInt();
		w2 = sc.nextInt();
		h2 = sc.nextInt();
		
		for (int i = 0; i < w; i++) {
			for (int a = 0; a < w2; a++) {
				for (int j = 0; j < h; j++) {
					for (int b = 0; b < h2; b++) {
						System.out.print(i % 2 == 0 ? j % 2 == 0 ? 'X' : '.' : j % 2 == 0 ? '.' : 'X');
					}
				}
				System.out.println();
			}
		}
	}
}
