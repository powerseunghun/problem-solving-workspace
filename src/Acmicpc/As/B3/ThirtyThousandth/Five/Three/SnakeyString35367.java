package Acmicpc.As.B3.ThirtyThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeyString35367 {
	static char[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int r = Integer.parseInt(str.split(" ")[0]);
		int c = Integer.parseInt(str.split(" ")[1]);
		arr = new char[r][c];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i] != '.') {
					sb.append(arr[j][i]);
				}
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
