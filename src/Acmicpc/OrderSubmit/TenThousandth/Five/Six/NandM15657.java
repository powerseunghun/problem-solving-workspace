package Acmicpc.OrderSubmit.TenThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NandM15657 {
	static int[] num = null;
	static int[] arr = null;
	static Map<String, Integer> map = new HashMap<>();
	static void dfs(int n, int d, int before) {
		if (d >= n) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i] + " ");
			}
			if (!map.containsKey(sb.toString())) {
				map.put(sb.toString(), 1);
				System.out.println(sb.toString());
			}
			return;
		}
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= before) {
				arr[d] = num[i];
				dfs(n, d+1, num[i]);
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		num = new int[N];
		arr = new int[M];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		
		dfs(M, 0, -1);
		br.close();
	}
}
