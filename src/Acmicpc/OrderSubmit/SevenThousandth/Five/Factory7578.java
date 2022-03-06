package Acmicpc.OrderSubmit.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Factory7578 {
	static int[] arr = null;
	static long[] tree = null;
	static Map<Integer, Integer> map = new HashMap<>();
	static long getSum(int s, int e, int l, int r, int node) {
		if (e < l || r < s) return 0;
		if (l <= s && e <= r) return tree[node];
		int m = (s+e) / 2;
		return getSum(s, m, l, r, node*2) + getSum(m+1, e, l, r, node*2+1);
	}
	static void renewal(int s, int e, int node, int idx, int val) {
		if (idx < s || e < idx) return;
		tree[node] += val;
		
		if (s != e) {
			int m = (s+e) / 2;
			renewal(s, m, node*2, idx, val);
			renewal(m+1, e, node*2+1, idx, val);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        long res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N+1];
		tree = new long[N*4];
		
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1, b = 0; i <= N; i++) {
			b = Integer.parseInt(st.nextToken());
			map.put(b, i);
		}
		
		for (int i = 1, a = 0, b = 0; i < arr.length; i++) {
			a = arr[i];
			b = map.get(a);
			res += getSum(1, N, b+1, N, 1);
			
			renewal(1, N, 1, b, 1);
		}
		
		System.out.println(res);
		br.close();
		
	}
}
