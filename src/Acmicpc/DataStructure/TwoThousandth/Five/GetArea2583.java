package Acmicpc.DataStructure.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class GetArea2583 {
	static int[][] arr = null;
	static int area = 0;
	static int count = 0;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void search(int x, int y) {
		if (x < 0 || y < 0 || x > (arr.length-1) || y > (arr[x].length-1)) return;
		
		if (arr[x][y] != 0) return;
		arr[x][y] = 1;
		count++;
		
		for (int i = 0; i < dirX.length; i++) {
			search(x+dirX[i], y+dirY[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		ArrayList<Integer> areaList = new ArrayList<>();
		int M = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]);
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		arr = new int[M][N];
		
		for (int i = 0; i < K; i++) {
			tmp = br.readLine();
			x1 = Integer.parseInt(tmp.split(" ")[0]);
			y1 = Integer.parseInt(tmp.split(" ")[1]);
			x2 = Integer.parseInt(tmp.split(" ")[2]);
			y2 = Integer.parseInt(tmp.split(" ")[3]);
			for (int j = y1; j < y2; j++) {
				for (int k = x1; k < x2; k++) {
					arr[j][k] = 1;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					count = 0;
					search(i, j);
					areaList.add(count);
				}
			}
		}
		Collections.sort(areaList);
		
		System.out.println(areaList.size());
		for (int i = 0; i < areaList.size(); i++) {
			System.out.print(areaList.get(i) + " ");
		}
	}
}
