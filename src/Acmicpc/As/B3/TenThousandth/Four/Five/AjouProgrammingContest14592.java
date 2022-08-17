package Acmicpc.As.B3.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class AjouProgrammingContest14592 {
	static int[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		arr = new int[N][4];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length-1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			arr[i][3] = i+1;
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					if (o1[1] == o2[1]) {
						if (o1[2] < o2[2]) return -1;
						else return 1;
					}
					else {
						if (o1[1] < o2[1]) return -1;
						else return 1;
					}
				}
				else {
					if (o1[0] > o2[0]) return -1;
					else return 1;
				}
			}
		});
		
		System.out.println(arr[0][3]);
		br.close();
	}
}
