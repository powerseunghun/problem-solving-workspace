package basic;

import java.util.Scanner;

public class IconZoom {
	public static void main(String[] args) {
		char[][] icon = {
			{'*', 'x', '*'},
			{' ', 'x', 'x'},
			{'*', ' ', '*'}};
		int k = new Scanner(System.in).nextInt();
		for (int i = 0; i < icon.length; i++) {
			for (int a = 0; a < k; a++) {
				for (int j = 0; j < icon[i].length; j++) {
					for (int b = 0; b < k; b++) {
						System.out.print(icon[i][j]);
					}
				}
				System.out.println();
			}
		}
	}
}
