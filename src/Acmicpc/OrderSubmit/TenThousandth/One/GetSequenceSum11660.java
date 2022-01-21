package Acmicpc.OrderSubmit.TenThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GetSequenceSum11660 {
	static void makeSequenceSum(int[][] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] += arr[i][j-1];
			}
		}
		for (int i = 1; i < arr[0].length; i++) {
			for (int j = 1; j < arr.length; j++) {
				arr[j][i] += arr[j-1][i];
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), val = 0;
		int[][] arr = new int[N+1][N+1];
		
		for (int i = 1; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		makeSequenceSum(arr);
		
		for (int i = 0, x1 = 0, y1 = 0, x2 = 0, y2 = 0; i < M; i++) {
			tmp = br.readLine();
			x1 = Integer.parseInt(tmp.split(" ")[0]);
			y1 = Integer.parseInt(tmp.split(" ")[1]);
			x2 = Integer.parseInt(tmp.split(" ")[2]);
			y2 = Integer.parseInt(tmp.split(" ")[3]);
			val = arr[x2][y2] - arr[x1-1][y2] - arr[x2][y1-1] + arr[x1-1][y1-1];
			sb.append(val + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
