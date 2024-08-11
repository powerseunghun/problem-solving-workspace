package Acmicpc.As.B3.ThirtyThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SeatMap30889 {
	static final int l = 20;
	static char[][] map = new char[l-10][l];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), s = 0, v = 0;
		String str = null;
		
		for (int i = 0; i < map.length; i++) {
			Arrays.fill(map[i], '.');
		}
		
		while(N-- > 0) {
			str = br.readLine();
			s = str.charAt(0) - 65;
			v = Integer.parseInt(str.substring(1, str.length()));
			map[s][v-1] = 'o';
		}
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				sb.append(map[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
