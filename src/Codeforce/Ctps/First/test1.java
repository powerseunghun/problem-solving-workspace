package Codeforce.Ctps.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), rat = 0, X = 0;
		
		for (int i = 0; i < t; i++) {
			rat = Integer.parseInt(br.readLine());
			X = 0;
			if (rat >= 1900) X = 1;
			else if (rat >= 1600) X = 2;
			else if (rat >= 1400) X = 3;
			else X = 4;
			sb.append("Division " + X + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
