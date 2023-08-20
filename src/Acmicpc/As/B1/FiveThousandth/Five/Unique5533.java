package Acmicpc.As.B1.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unique5533 {
	static final int rnd = 3;
	static final int maxScore = 101;
	static int[] arr = null;
	static int[] scores = null;
	static int[][] sArr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = null;
		
		arr = new int[N];
		sArr = new int[rnd][N];
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			for (int j = 0, v = 0; j < rnd; j++) {
				v = Integer.parseInt(str.split(" ")[j]);
				sArr[j][i] = v;
			}
		}
		
		for (int i = 0; i < sArr.length; i++) {
			scores = new int[maxScore];
			for (int j = 0; j < sArr[i].length; j++) {
				scores[sArr[i][j]]++;
			}
			
			for (int j = 0; j < sArr[i].length; j++) {
				if (scores[sArr[i][j]] == 1) {
					arr[j] += sArr[i][j];
				}
			}
		}
		
		for (int el : arr) {
			sb.append(el).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
