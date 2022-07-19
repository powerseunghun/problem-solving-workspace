package Acmicpc.As.B3.TenThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BlackFriday11213 {
	static int[] arr = new int[7];
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 1, idx = 0; i <= N; i++) {
			idx = Integer.parseInt(st.nextToken());
			arr[idx]++;
			map.put(idx, i);
		}
		
		for (int i = 1; i < arr.length; i++) {
			max = arr[i] == 1 ? Math.max(max, i) : max;
		}
		
		System.out.println(max == Integer.MIN_VALUE ? "none" : map.get(max));
		br.close();
	}
}
