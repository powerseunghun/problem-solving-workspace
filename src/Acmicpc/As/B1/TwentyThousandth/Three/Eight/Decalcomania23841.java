package Acmicpc.As.B1.TwentyThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import Acmicpc.Sorting.TwoThousandth.Nine.FeequencySort2910;

public class Decalcomania23841 {
	static char[][] arr = null;
	static Map<Character, Integer> mapX = new HashMap<>();
	static Map<Character, Integer> mapY = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		arr = new char[N][M];
		
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], ' ');
		}
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != ' ') continue;
				arr[i][j] = str.charAt(j);
				if (arr[i][j] != '.') {
					arr[i][M-j-1] = arr[i][j];
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
