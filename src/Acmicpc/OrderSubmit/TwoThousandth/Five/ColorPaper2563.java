package Acmicpc.OrderSubmit.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColorPaper2563 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[101][101];
		int N = Integer.parseInt(br.readLine()), count = 0;
		String tmp = null;
		
		for (int i = 0, s = 0, e = 0; i < N; i++) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[0]);
			e = Integer.parseInt(tmp.split(" ")[1]);
			
			for (int j = s; j < s+10; j++) {
				for (int k = e; k < e+10; k++) {
					arr[j][k] = 1;
				}
			}
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][j] != 0) count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
