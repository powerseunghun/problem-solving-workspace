package Acmicpc.Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRepea2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), r = 0;
		String c = null;
		for (int i = 0; i < T; i++) {
			c = br.readLine();
			r = Integer.parseInt(c.split(" ")[0]);
			c = c.split(" ")[1];
			for (int k = 0; k < c.length(); k++) {
				for (int j = 0; j < r; j++) {
					System.out.print(c.charAt(k));
				}
			}
			System.out.println();
		}
	}
}
