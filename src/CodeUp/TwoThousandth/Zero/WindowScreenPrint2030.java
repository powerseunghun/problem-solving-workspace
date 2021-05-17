package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WindowScreenPrint2030 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = null, tmp = null;
		int n = 0, x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		
		char[][] window = new char[32][62];
		for (int i = 0; i < window.length; i++)
			for (int j = 0; j < window[i].length; j++) 
				window[i][j] = '.';
		
		n = Integer.parseInt(br.readLine());
		for (int a = 0; a < n; a++) {
			tmp = br.readLine();
			s = tmp.split(" ")[0];
			x1 = Integer.parseInt(tmp.split(" ")[1]);
			y1 = Integer.parseInt(tmp.split(" ")[2]);
			x2 = Integer.parseInt(tmp.split(" ")[3]);
			y2 = Integer.parseInt(tmp.split(" ")[4]);
			for(int i = y1; i <= y2; i++) {
				if (i == y1 || i == y2) {
					window[i][x1] = '+';
					window[i][x2] = '+';
					for (int j = x1 + 1; j < x2; j++) {
						window[i][j] = '-';
					}
					int index = 0;
					if (i == y1) {
						if (s.length() <= (x2 - x1 - 1)) {
							for (int j = x1 + 1; j < x1 + 1 + s.length(); j++) {
								window[i][j] = s.charAt(index++);
							}
						}
						else {
							for (int j = x1 + 1; j < x2; j++) {
								window[i][j] = s.charAt(index++);
							}
						}
					}
				}
				else {
					window[i][x1] = '|';
					window[i][x2] = '|';
					for (int j = x1 + 1; j < x2; j++) {
						window[i][j] = ' ';
					}
				}
			}
		}
		
		for (int i = 1; i < window.length - 1; i++) {
			for (int j = 1; j < window[i].length - 1; j++) {
				System.out.print(window[i][j]);
			}
			System.out.println();
		}
	}
}
