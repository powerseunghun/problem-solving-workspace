package Goorm.AlgorithmHeroes.T2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlaCard {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), s = 0, e = N-1, max = Integer.MIN_VALUE;
		int answerStart = 0, answerEnd = 0, area = 0;
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		while (s < e) {
			area = (e-s) * Math.min(arr[s], arr[e]);
			if (area > max) {
				answerStart = s+1;
				answerEnd = e+1;
				max = area;
			}
			
			if (arr[s] <= arr[e]) s++;
			else e--;
		}
		
		System.out.println(max + "\n" + answerStart + " " + answerEnd);
		br.close();
	}
}
