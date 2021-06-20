package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GridValueCalc4042 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int[][] arr = new int[5][5];
		int[] rowMax = new int[5], colMax = new int[5];
		int rowMaxSum = 0, colMaxSum = 0;
		Arrays.fill(rowMax, 0);
		Arrays.fill(colMax, 0);
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				int val = Integer.parseInt(tmp.split(" ")[j]);
				rowMax[i] = val >= rowMax[i] ? val : rowMax[i];
				colMax[j] = val >= colMax[j] ? val : colMax[j];
			}
		}
		for (int el : rowMax) {
			rowMaxSum += el;
		}
		for (int el : colMax) {
			colMaxSum += el;
		}
		System.out.println(Math.abs(rowMaxSum - colMaxSum));
	}
}
