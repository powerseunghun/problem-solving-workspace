package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuGuClass {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), lineCount = 0;
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				sb.append(i + " * " + j + " = " + (i*j) + " ");
				lineCount++;
				if (lineCount == N) {
					sb.append("\n");
					lineCount = 0;
				}
			}
		}
		System.out.print(sb.toString());
	}
}
