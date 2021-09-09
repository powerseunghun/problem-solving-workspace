package SWExpertAcademy.D3.EightThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Exam8888 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String tmp = null;
		int TC = Integer.parseInt(br.readLine()), N = 0, T = 0, P = 0, cnt = 0;
		int[][] arr = null;
		int[] score = null, rank = null;
		
		for (int i = 1; i <= TC; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			T = Integer.parseInt(tmp.split(" ")[1]);
			P = Integer.parseInt(tmp.split(" ")[2]);
			arr = new int[N][T+2];
			score = new int[T];
			rank = new int[N];
			Arrays.fill(rank, 1);
			for (int j = 0; j < arr.length; j++) {
				st = new StringTokenizer(br.readLine());
				cnt = 0;
				for (int k = 0; k < arr[j].length-2; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
					if (arr[j][k] == 1) cnt++;
					else score[k]++;
				}
				arr[j][T] = cnt;
			}
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length-2; k++) {
					if (arr[j][k] == 1) {
						arr[j][T+1] += score[k];
					}
				}
			}
			
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (j == k) continue;
					if (arr[j][T+1] < arr[k][T+1]) {
						rank[j]++;
					}
					else if (arr[j][T+1] == arr[k][T+1] && arr[j][T] == arr[k][T]) {
						if (j > k) rank[j]++;
					}
					else if (arr[j][T+1] == arr[k][T+1]) {
						if (arr[j][T] < arr[k][T]) rank[j]++;
					}
				}
			}
			sb.append("#" + i + " " + arr[P-1][T+1] + " " + rank[P-1] + "\n");
		}
		System.out.print(sb.toString());
	}
}
