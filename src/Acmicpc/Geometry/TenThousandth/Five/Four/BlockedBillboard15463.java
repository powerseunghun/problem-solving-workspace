package Acmicpc.Geometry.TenThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlockedBillboard15463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int[][] location = new int[3][4];
		int area = 0, width = 0, height = 0;
		
		for (int i = 0; i < location.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < location[i].length; j++) {
				location[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		
		for (int i = 0; i < 2; i++) {
			area += (location[i][2]-location[i][0]) * (location[i][3]-location[i][1]);
			width = Math.min(location[2][2], location[i][2]) - Math.max(location[2][0], location[i][0]);
			height = Math.min(location[2][3], location[i][3]) - Math.max(location[2][1], location[i][1]);
			
			if (width > 0 && height > 0) area -= (width * height);
		}
		
		System.out.println(area);
	}
}
