package Acmicpc.As.S5.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TodayLose14582 {
	static int[][] arr = new int[2][9];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int sum1 = 0, sum2 = 0;
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(str.split(" ")[j]);
			}
		}
		
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j % 2 == 0) {
					sum1 += arr[j][i];
					if (sum1 > sum2) flag = true;
				}
				else sum2 += arr[j][i];
			}
		}
		
		System.out.println(sum2 > sum1 && flag ? "Yes" : "No");
		br.close();
		
	}
}
