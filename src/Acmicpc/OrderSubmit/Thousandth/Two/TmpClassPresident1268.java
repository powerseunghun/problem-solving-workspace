package Acmicpc.OrderSubmit.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TmpClassPresident1268 {
	static int[][] arr = null;
	static int[][] cnts = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0, max = Integer.MIN_VALUE, res = 0;
		StringTokenizer st = null;
		arr = new int[N][5];
		cnts = new int[1001][1001];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < N-1; j++) {
				for (int k = j+1; k < N; k++) {
					if (arr[j][i] == arr[k][i]) {
						cnts[j][k] = 1;
						cnts[k][j] = 1;
					}
				}
			}
		}
		
		for (int i = 0; i < cnts.length; i++) {
			sum = 0;
			for (int j = 0; j < cnts[i].length; j++) {
				sum += cnts[i][j] > 0 ? 1 : 0;
			}
			if (sum > max) {
				res = i+1;
				max = sum;
			}
		}
		System.out.println(res == 0 ? 1 : res);
		br.close();
	}
}
