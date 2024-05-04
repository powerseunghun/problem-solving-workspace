package Acmicpc.As.B3.TenThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LostLineup17884 {
	static class P implements Comparable<P>{
		int n;
		int idx;
		
		public P(int n, int idx) {
			this.n = n;
			this.idx = idx;
		}
		
		@Override
		public int compareTo(P o) {
			return this.n-o.n;
		}
	}
	static P[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine())-1;
		String[] strs = br.readLine().split(" ");
		arr = new P[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new P(Integer.parseInt(strs[i]), i);
		}
		Arrays.sort(arr);
		
		sb.append("1 ");
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i].idx+2 + " ");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
