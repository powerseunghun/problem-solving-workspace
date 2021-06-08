package CodeUp.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GetCandy3515 {
	static int[] arr = null;
	static int max = 0;
	static void bt(int N, int depth, int[][] candy, boolean[] check) {
		if (N == depth) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + " ");
				sum += arr[i];
			}
			max = max >= sum ? max : sum;
			return;
		}
		
		for (int j = 0; j < candy[depth].length; j++) {
			boolean check2[] = check.clone();
			if (!check[j]) {
				arr[j] = candy[depth][j];
				check2[j] = true;
				bt(N, depth+1, candy, check2);
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
		System.out.println(max);
	}
}
