package Acmicpc.OrderSubmit.TenThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class NM15664 {
	static int[] arr = null;
	static int[] num = null;
	static Set<String> set = new HashSet<>();
	static StringBuilder sb = new StringBuilder();
	static void func(int n, int d, int idx) {
		if (d >= n) {
			String check = "";
			for (int i = 0; i < arr.length; i++) {
				check += (arr[i] + " ");
			}
			if (!set.contains(check)) {
				set.add(check);
				sb.append(check + "\n");
			}
			return;
		}
		
		for (int i = idx; i < num.length; i++) {
			arr[d] = num[i];
			func(n, d+1, i+1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		
		arr = new int[M];
		num = new int[N];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		func(M, 0, 0);
		
		System.out.print(sb.toString());
		br.close();
	}
}
