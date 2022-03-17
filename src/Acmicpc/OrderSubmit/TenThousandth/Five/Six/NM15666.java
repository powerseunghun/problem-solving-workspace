package Acmicpc.OrderSubmit.TenThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NM15666 {
	static int[] nums = null;
	static int[] arr = null;
	static Map<String, Integer> map = new HashMap<>();
	static StringBuilder sb = new StringBuilder();
	static void func(int M, int d, int idx) {
		if (d >= M) {
			String tmp = "";
			for (int i = 0; i < arr.length; i++) {
				tmp += (arr[i] + " ");
			}
			if (!map.containsKey(tmp)) {
				sb.append(tmp + "\n");
				map.put(tmp, 1);
			}
			return;
		}
		
		for (int i = idx; i < nums.length; i++) {
			arr[d] = nums[i];
			func(M, d+1, i);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		nums = new int[N];
		arr = new int[M];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		func(M, 0, 0);
		
		System.out.print(sb.toString());
		br.close();
	}
}
