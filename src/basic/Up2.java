package basic;

import java.util.Scanner;

public class Up2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt(), count = 0;
		int[][] floor = new int[m][n];
		int[] max = new int[10], tmp = new int[10];
		
		for (int i = 0; i < floor.length; i++) {
			count = 0;
			for (int j = 0; j < floor[i].length; j++) {
				floor[i][j] = sc.nextInt();
				if (floor[i][j] == -1) count++;
				else {
					tmp[floor[i][j]]++;
				}
			}
			if (count == n || i == floor.length - 1) {
				for (int a = 0; a < max.length; a++) {
					max[a] = max[a] <= tmp[a] ? tmp[a] : max[a];
				}
				for (int a = 0; a < tmp.length; a++) {
					tmp[a] = 0;
				}
			}
		}
		
		for (int i = 0; i < max.length; i++) {
			if (max[i] == 0) continue;
			else {
				System.out.println(i + " " + max[i]);
			}
		}
	}
}
