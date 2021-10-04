package SWExpertAcademy.D4.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HighShelf1486 {
	static int[] arr = null;
	static int res = 0;
	static void dfs(int N, int d, int B, int sum) {
		if (d >= N) {
			if (sum >= B) {
				res = Math.min(res, sum);
			}
			return;
		}
		if (sum >= B) {
			res = Math.min(res, sum);
			return;
		}
		
		dfs(N, d+1, B, sum+arr[d]);
		dfs(N, d+1, B, sum);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0, B = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			res = Integer.MAX_VALUE;
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			dfs(N, 0, B, 0);
			sb.append("#" + i + " " + (res-B) + "\n");
		}
		System.out.print(sb.toString());
	}
}
