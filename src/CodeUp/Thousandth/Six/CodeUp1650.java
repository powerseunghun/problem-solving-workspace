package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1650 {
	public static void main(String[] args) throws IOException {
		String[] codeup = {
			    " ****  ***  ***   ***** *   * ****",
			    "*     *   * *  *  *     *   * *   *",
			    "*     *   * *   * *     *   * *   *",
			    "*     *   * *   * ****  *   * ****",
			    "*     *   * *   * *     *   * *",
			    "*     *   * *  *  *     *   * *",
			    " ****  ***  ***   *****  ***  *"
		};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int w = Integer.parseInt(tmp.split(" ")[0]);
		int h = Integer.parseInt(tmp.split(" ")[1]);
		for (int i = 0; i < codeup.length; i++) {
			for (int j = 0; j < h; j++) {
				for (int k = 0; k < codeup[i].length(); k++) {
					for (int l = 0; l < w; l++) {
						System.out.print(codeup[i].charAt(k));
					}
				}
				System.out.println();
			}
		}
	}
}
