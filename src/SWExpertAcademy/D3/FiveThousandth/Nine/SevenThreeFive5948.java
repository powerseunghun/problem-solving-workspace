package SWExpertAcademy.D3.FiveThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class SevenThreeFive5948 {
	static int[] n = new int[7];
	static int[] arr = new int[3];
	static boolean[] check = new boolean[7];
	static Map<Integer, Integer> map = new HashMap<>();
	static ArrayList<Integer> list = new ArrayList<>();
	static void dfs(int N, int d) {
		if (d >= N) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			if (!map.containsKey(sum)) {
				map.put(sum, 1);
				list.add(sum);
			}
			return;
		}
		
		for (int i = 0; i < n.length; i++) {
			if (!check[i]) {
				arr[d] = n[i];
				check[i] = true;
				dfs(N, d+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			Arrays.fill(arr, 0);
			map.clear();
			list.clear();
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n.length; j++) {
				n[j] = Integer.parseInt(st.nextToken());
			}
			dfs(3, 0);
			Collections.sort(list, Collections.reverseOrder());
			sb.append("#" + i + " " + list.get(4) + "\n");
		}
		System.out.print(sb.toString());
 	}
}
