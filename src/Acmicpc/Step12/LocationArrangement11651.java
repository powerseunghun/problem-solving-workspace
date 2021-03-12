package Acmicpc.Step12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LocationArrangement11651 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] points = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			points[i][0] = sc.nextInt();
			points[i][1] = sc.nextInt();
		}
		
		Arrays.sort(points, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				else return o1[1] - o2[1];
			}
		});
		
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				System.out.print(points[i][j] + " ");
			}
			System.out.println();
		}
		
//		for (int i = 0; i < points.length; i++) {
//		}
	}
}
