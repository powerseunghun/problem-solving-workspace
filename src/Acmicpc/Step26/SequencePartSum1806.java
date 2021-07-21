package Acmicpc.Step26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SequencePartSum1806 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int S = Integer.parseInt(tmp.split(" ")[1]);
		int val = 0, idx1 = 0, idx2 = 0, min = Integer.MAX_VALUE;
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			val = Integer.parseInt(st.nextToken());
			arr[i] = i == 0 ? val : val + arr[i-1];
		}
		
		while (idx1 <= idx2 && (idx1 < N && idx2 < N)) {
			val = idx1 == idx2 ? arr[idx1] : arr[idx2] - arr[idx1];
			
			if (val >= S) {
				min = Math.min(min, idx1 == idx2 ? 1 : idx2-idx1);
			}
			if (val <= S) idx2++;
			else idx1++;
		}
		if (idx2 == N && idx1 == 0) {
			if (arr[N-1] == S) min = Math.min(min, N); 
		}
		System.out.println(min == Integer.MAX_VALUE ? 0 : min);
	}
}
