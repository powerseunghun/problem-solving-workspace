package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FourSquareArea1507 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0, cnt = 0;
		int[][] list = new int[100][100];
		
		for (int i = 0; i < 4; i++) {
			String tmp = br.readLine();
			x1 = Integer.parseInt(tmp.split(" ")[0]);
			y1 = Integer.parseInt(tmp.split(" ")[1]);
			x2 = Integer.parseInt(tmp.split(" ")[2]);
			y2 = Integer.parseInt(tmp.split(" ")[3]);
			
			if (x1 > x2) {
				i = x1;
				x1 = x2;
				x2 = i;
			}
			if (y1 > y2) {
				i = y1;
				y1 = y2;
				y2 = i;
			}
			
			for (int j = x1; j < x2; j++) {
				for (int k = y1; k < y2; k++) {
					list[j][k] = 1;
				}
			}
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				cnt = list[i][j] == 1 ? cnt += 1 : cnt;
			}
		}
		System.out.println(cnt);
	}
}
