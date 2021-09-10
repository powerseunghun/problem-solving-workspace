package SWExpertAcademy.D3.EightThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acronym8741 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null, acr = null;
		String[] strArr = null;
		char c1 = ' ', c2 = ' ', c3 = ' ';
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			acr = "";
			strArr = tmp.split(" ");
			c1 = (char)(strArr[0].charAt(0) - 32);
			c2 = (char)(strArr[1].charAt(0) - 32);
			c3 = (char)(strArr[2].charAt(0) - 32);
			acr = (c1 + "" + c2 + "" + c3);
			sb.append("#" + i + " " + acr.toUpperCase() + "\n");
		}
		System.out.print(sb.toString());
	}
}
