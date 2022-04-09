package Acmicpc.OrderSubmit.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea2669 {
	static int[][] arr = new int[101][101];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0, sum = 0;
		
		for (int i = 0; i < 4; i++) {
			tmp = br.readLine();
			x1 = Integer.parseInt(tmp.split(" ")[0]);
			y1 = Integer.parseInt(tmp.split(" ")[1]);
			x2 = Integer.parseInt(tmp.split(" ")[2]);
			y2 = Integer.parseInt(tmp.split(" ")[3]);
			
			for (int x = x1; x < x2; x++) {
				for (int y = y1; y < y2; y++) {
					arr[x][y] = 1;
				}
			}
		}
		for (int[] a : arr) {
			for (int v : a) {
				sum += v == 1 ? 1 : 0;
			}
		}
		System.out.println(sum);
		br.close();
	}
}
