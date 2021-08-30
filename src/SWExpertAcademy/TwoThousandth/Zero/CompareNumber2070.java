package SWExpertAcademy.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareNumber2070 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0;
		char op = ' ';
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			if (a > b) op = '>';
			else if (a < b) op = '<';
			else op = '=';
			sb.append("#" + i + " " + op + "\n");
		}
		System.out.print(sb.toString());
	}
}
