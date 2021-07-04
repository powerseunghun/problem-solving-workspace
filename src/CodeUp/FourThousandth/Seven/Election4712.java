package CodeUp.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Election4712 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine()), max = 0, maxCount = 0, maxScore = 0;
		int[][] arr = new int[3][4];
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			for (int j = 0; j < 3; j++) {
				int val = Integer.parseInt(tmp.split(" ")[j]);
				arr[j][val-1]++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0, weight = 1; j < arr[i].length-1; j++, weight++) {
				arr[i][3] += (arr[i][j] * weight);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[0].length-1; j >= 0; j--) {
				max = 0;
				maxCount = 0;
				for (int k = 0; k < arr.length; k++) {
					max = Math.max(max, arr[k][j]);
					maxScore = j == arr[0].length-1 ? Math.max(maxScore, arr[k][j]) : maxScore;
				}
				for (int k = 0; k < arr.length; k++) {
					if (max == arr[k][j]) maxCount++;
				}
				if (maxCount == 1) {
					for (int k = 0; k < arr.length; k++) {
						if (max == arr[k][j] && arr[k][3] == maxScore) {
							System.out.print((k+1) + " " + arr[k][3]);
							return;
						}
					}
				}
			}
		}
		
		System.out.println("0 " + maxScore);
	}
}
