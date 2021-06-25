package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GetRank4067 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int[][] arr = new int[n][4];
		int[] rank = new int[n], weight = {3, 1};
		Arrays.fill(rank, 1);
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][3] += (arr[i][j] * weight[j]);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;
				if (arr[i][3] < arr[j][3]) {
					rank[i]++;
				}
			}
		}
		
		System.out.println(rank[m-1]);
		for (int i = 0; i < rank.length; i++) {
			System.out.print(rank[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
