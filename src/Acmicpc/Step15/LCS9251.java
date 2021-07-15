package Acmicpc.Step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS9251 {
	static int[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		arr = new int[1001][1001];
		
		for (int i = 1; i <= s2.length(); i++) {
			for (int j = 1; j <= s1.length(); j++) {
				if (s2.charAt(i-1) == s1.charAt(j-1)) {
					arr[i][j] = arr[i-1][j-1] + 1;
				}
				else {
					arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
				}
			}
		}
		System.out.println(arr[s2.length()][s1.length()]);
	}
}
