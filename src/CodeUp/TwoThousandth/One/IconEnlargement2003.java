package CodeUp.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IconEnlargement2003 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		char[][] icon = {{'*', 'x', '*'}, {' ', 'x', 'x'}, {'*', ' ', '*'}};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		
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
