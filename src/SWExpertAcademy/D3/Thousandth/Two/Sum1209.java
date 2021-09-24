package SWExpertAcademy.D3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum1209 {
	static int getMax(int[][] arr) {
		int max = Integer.MIN_VALUE, sum1 = 0, sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 = 0;
			sum2 = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			max = Math.max(max, Math.max(sum1, sum2));
		}
		
		sum1 = 0;
		sum2 = 0;
		for (int i = 0, j = arr[i].length-1; i < arr.length; i++, j--) {
			sum1 += arr[i][i];
			sum2 += arr[i][j];
		}
		max = Math.max(max, Math.max(sum1, sum2));
		return max;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int[][] arr = new int[100][100];
		
		for (int i = 1; i <= 10; i++) {
			br.readLine();
			for (int j = 0; j < arr.length; j++) {
				tmp = br.readLine();
				for (int k = 0; k < arr[j].length; k++) {
					arr[j][k] = Integer.parseInt(tmp.split(" ")[k]);
				}
			}
			sb.append("#" + i + " " + getMax(arr) + "\n");
		}
		System.out.print(sb.toString());
	}
}
