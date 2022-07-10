package Acmicpc.As.B4.TwentyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class МишаИНегатив21665 {
	static int[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]), cnt = 0;
		arr = new int[n][m];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.split("")[j].charAt(0);
			}
		}
		br.readLine();
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				if (tmp.split("")[j].charAt(0) == arr[i][j]) cnt++;
			}
		}
		
		System.out.println(cnt);
		br.close();
	}
}
