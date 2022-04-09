package Acmicpc.OrderSubmit.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxValue2566 {
	static int[][] arr = new int[9][9];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int max = Integer.MIN_VALUE, x = 0, y = 0;
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, arr[i][j]);
				if (max == arr[i][j]) {
					x = i;
					y = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((x+1) + " " + (y+1));
		br.close();
	}
}
