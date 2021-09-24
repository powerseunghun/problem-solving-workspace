package SWExpertAcademy.D3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Magnetic1220 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int[][] arr = new int[100][100];
		int N = 0, cnt = 0, val = 0;
		
		for (int i = 1; i <= 10; i++) {
			N = Integer.parseInt(br.readLine());
			cnt = 0;
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < N; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			for (int j = 0; j < arr.length; j++) {
				val = 0;
				for (int k = 0; k < arr.length; k++) {
					if (arr[k][j] == 2 && val == 1) {
						cnt++;
						val = 0;
					}
					else if (arr[k][j] == 1) val = 1; 
				}
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
