package Acmicpc.OrderSubmit.TenThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class NM15665 {
	static int[] arr = null;
	static int[] num = null;
	static Set<String> set = new HashSet<>();
	static StringBuilder sb = new StringBuilder();
	static void func(int m, int d) {
		if (d >= m) {
			String check = "";
			for (int i = 0; i < arr.length; i++) {
				check += (arr[i] + " ");
			}
			if (!set.contains(check)) {
				sb.append(check + "\n");
				set.add(check);
			}
			return;
		}
		for (int i = 0; i < num.length; i++) {
			arr[d] = num[i];
			func(m, d+1);
		}
	}
	public static void main(String[] args) throws IOException {
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
		func(M, 0);
		
		System.out.print(sb.toString());
		br.close();
	}
}
