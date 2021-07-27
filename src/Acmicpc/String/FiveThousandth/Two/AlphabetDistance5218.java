package Acmicpc.String.FiveThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetDistance5218 {
	static int getDistance(char c1, char c2) {
		if (c2 >= c1) return (int)c2 - (int)c1;
		else return ((int)(c2 + 26) - (int)c1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String tmp = null;
		String s1 = null;
		String s2 = null;
		
		for (int i = 0; i < n; i++) {
			sb.append("Distances: ");
			tmp = br.readLine();
			s1 = tmp.split(" ")[0];
			s2 = tmp.split(" ")[1];
			for (int j = 0; j < s1.length(); j++) {
				sb.append(getDistance(s1.charAt(j), s2.charAt(j)) + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}
