package Goorm.Level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowerMatrixDAC {
	static int[][] arr = null;
	static int[][] eMatrix = null;
	static int[][] powerMatrix(int power, int[][] arr) {
		if (power == 0) return eMatrix;
		else if (power == 1) return arr;
		
		int[][] pMatrix = powerMatrix(power/2, arr);
		pMatrix = multipleMatrix(pMatrix, pMatrix);
		
		if (power % 2 == 0) {
			return pMatrix;
		}
		else return multipleMatrix(pMatrix, arr);
	}
	static int[][] multipleMatrix(int[][] arr1, int[][] arr2) {
		int[][] resArr = new int[arr.length][arr.length];
		
		for (int i = 0; i < resArr.length; i++) {
			for (int j = 0; j < resArr[i].length; j++) {
				for (int k = 0; k < arr.length; k++) {
					resArr[i][j] += (arr1[i][k] * arr2[k][j]) % 10007;
				}
				resArr[i][j] %= 10007;
			}
		}
		return resArr;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int power = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N][N];
		eMatrix = new int[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		
		// e
		for (int i = 0; i < eMatrix.length; i++) {
			eMatrix[i][i] = 1;
		}
		
		arr = powerMatrix(power, arr);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
