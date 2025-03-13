package Acmicpc.As.B2.TwentyThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mirror25755 {
	static int[][] arr = null;
	static String func(int el) {
		switch(el) {
		case 1: case 8:
			return String.valueOf(el);
		case 2:
			return String.valueOf(5);
		case 5:
			return String.valueOf(2);
		}
		return "?";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		char dir = str.split(" ")[0].charAt(0);
		int N = Integer.parseInt(str.split(" ")[1]);
		arr = new int[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(str.split(" ")[j]);
			}
		}
		if (dir == 'L' || dir == 'R') {
			for (int i = 0; i < arr.length; i++) {
				for (int j = arr[i].length-1; j >= 0; j--) {
					sb.append(func(arr[i][j])).append(" ");
				}
				sb.append("\n");
			}
		} else {
			for (int i = arr.length-1; i >= 0; i--) {
				for (int j = 0; j < arr[i].length; j++) {
					sb.append(func(arr[i][j])).append(" ");
				}
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
