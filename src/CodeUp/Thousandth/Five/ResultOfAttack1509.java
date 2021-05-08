package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ResultOfAttack1509 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringTokenizer st = null;
		boolean flag = true;
		int[][] arr = new int[10][10];
		int[] h = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < h.length; i++) {
			h[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < h.length; i++) {
			if (h[i] == 1) {
				flag = true;
				for (int j = arr.length-1; j >= 0; j--) {
					if (arr[j][i] > 0) {
						flag = false;
						System.out.println((i+1) + " crash");
						break;
					}
					else if (arr[j][i] < 0) {
						flag = false;
						System.out.println((i+1) + " fall");
						break;
					}
				}
				if (flag) System.out.println((i+1) + " safe");
			}
		}
	}
}
