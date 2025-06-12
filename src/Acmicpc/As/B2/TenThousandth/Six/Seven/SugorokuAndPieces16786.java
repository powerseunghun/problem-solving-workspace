package Acmicpc.As.B2.TenThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SugorokuAndPieces16786 {
	static int[] arr = null;
	static final int l = 2019;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), idx = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<Integer> set = new HashSet<>();
		
		arr = new int[N];
		for (int i = 0, v = 0; i < arr.length; i++) {
			v = Integer.parseInt(st.nextToken());
			arr[i] = v;
			set.add(v);
		}
		br.readLine();
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			idx = Integer.parseInt(st.nextToken())-1;
			if (set.contains(arr[idx]+1) || (arr[idx]+1) > l) {
				continue;
			}
			set.remove(arr[idx]);
			set.add(arr[idx]+1);
			arr[idx]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
