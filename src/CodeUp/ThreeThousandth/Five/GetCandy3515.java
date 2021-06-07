package CodeUp.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GetCandy3515 {
	static int[] arr = null;
	static void bt(int N, int depth, int[][] candy, boolean[] check) {
		if (N == depth) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int j = 0; j < candy[depth].length; j++) {
			if (!check[j]) {
				arr[j] = candy[depth][j];
				check[j] = true;
				System.out.println("HH");
				bt(N, depth+1, candy, check.clone());
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		int[][] candy = new int[N][N];
		arr = new int[N];
		boolean[] check = new boolean[N];
		for (int i = 0; i < candy.length; i++) {
			Arrays.fill(candy[i], 0);
		}
		Arrays.fill(arr, 0);
		Arrays.fill(check, false);
		
		for (int i = 0; i < candy.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < candy[i].length; j++) {
				candy[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		
		bt(N, 0, candy, check);
//		for (int i = 0; i < candy[0].length; i++) {
//		}
		
		System.out.println("E");
	}
}
