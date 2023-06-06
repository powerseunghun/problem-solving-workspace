package Acmicpc.As.B2.TenThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class MakeSpace10471 {
	static int[] arr = null;
	static Set<Integer> set = new HashSet<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int W = Integer.parseInt(str.split(" ")[0]);
		int P = Integer.parseInt(str.split(" ")[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> aList = null;
		
		arr = new int[P+1];
		set.add(W);
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr[i] = W;
				continue;
			}
			arr[i] = Integer.parseInt(st.nextToken());
			set.add(arr[i]);
		}
		Arrays.sort(arr);
		
		for (int v : arr) {
			for (int w : arr) {
				if (w - v > 0) {
					set.add(w-v);
				}
			}
		}
		aList = new ArrayList<>(set);
		Collections.sort(aList);
		
		for (int el : aList) {
			sb.append(el).append(" ");
		}
		
		System.out.println(sb.toString());
		br.close();
		
	}
}
