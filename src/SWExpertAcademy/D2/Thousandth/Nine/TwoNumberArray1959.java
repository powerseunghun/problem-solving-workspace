package SWExpertAcademy.D2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoNumberArray1959 {
	static long func(int[] arr1, int[] arr2) {
		long res = 0, max = Integer.MIN_VALUE;
		if (arr1.length == arr2.length) {
			for(int i = 0; i < arr1.length; i++) {
				res += (arr1[i] * arr2[i]);
			}
			max = Math.max(max, res);
		}
		else if (arr1.length > arr2.length) {
			for (int i = 0; i < arr1.length-arr2.length+1; i++) {
				res = 0;
				for (int j = 0; j < arr2.length; j++) {
					res += arr1[i+j] * arr2[j];
				}
				max = Math.max(max, res);
			}
		}
		else {
			for (int i = 0; i < arr2.length-arr1.length+1; i++) {
				res = 0;
				for (int j = 0; j < arr1.length; j++) {
					res += arr1[j] * arr2[i+j];
				}
				max = Math.max(max, res);
			}
		}
		return max;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0;
		int[] arr1 = null, arr2 = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			arr1 = new int[N];
			arr2 = new int[M];
			tmp = br.readLine();
			for (int j = 0; j < N; j++) {
				arr1[j] = Integer.parseInt(tmp.split(" ")[j]);
			}
			tmp = br.readLine();
			for (int j = 0; j < M; j++) {
				arr2[j] = Integer.parseInt(tmp.split(" ")[j]);
			}
			sb.append("#" + i + " " + func(arr1, arr2) + "\n");
		}
		System.out.print(sb.toString());
	}
}
