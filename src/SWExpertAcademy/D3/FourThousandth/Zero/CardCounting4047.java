package SWExpertAcademy.D3.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CardCounting4047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		boolean check = true;
		int T = Integer.parseInt(br.readLine()), r = 0, val = 0, cnt = 0;
		int[][] arr = new int[4][14];
		char pattern = ' ';
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			check = true;
			for (int j = 0; j < arr.length; j++) {
				Arrays.fill(arr[j], 0);
			}
			sb.append("#" + i + " ");
			for (int j = 0; j < tmp.length(); j++) {
				if (!(tmp.charAt(j) >= '0' && tmp.charAt(j) <= '9')) {
					pattern = tmp.charAt(j);
					switch(pattern) {
					case 'S':
						r = 0;
						break;
					case 'D':
						r = 1;
						break;
					case 'H':
						r = 2;
						break;
					case 'C':
						r = 3;
						break;
					}
					val = Integer.parseInt(tmp.substring(j+1, j+3));
					arr[r][val]++;
					if (arr[r][val] > 1) {
						sb.append("ERROR\n");
						check = false;
					}
				}
			}
			if(!check) continue;
			for (int j = 0; j < arr.length; j++) {
				cnt = 0;
				for (int k = 1; k < arr[j].length; k++) {
					if (arr[j][k] == 0) cnt++;
				}
				sb.append(cnt + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
