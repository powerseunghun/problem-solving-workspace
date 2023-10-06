package Acmicpc.As.B1.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NPuzzle3041 {
	static final int len = 4;
	static Map<Character, Integer> mapX = new HashMap<>();
	static Map<Character, Integer> mapY = new HashMap<>();
	static char[][] origin = new char[len][len];
	static int getManhattanDistance(int x1, int y1, int x2, int y2) {
		return Math.abs(x1-x2) + Math.abs(y1-y2);
	}
	static void init() {
		char c = 'A';
		for (int i = 0; i < origin.length; i++) {
			for (int j = 0; j < origin[i].length; j++) {
				origin[i][j] = i == origin.length-1 && j == origin[i].length-1 ? '.' : c++;
				mapX.put(origin[i][j], i);
				mapY.put(origin[i][j], j);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] arr = new char[len][len];
		String str = null;
		int res = 0;
		init();
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == '.') continue;
				if (arr[i][j] != origin[i][j]) {
					res += getManhattanDistance(i, j, mapX.get(arr[i][j]), mapY.get(arr[i][j]));
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
