package Codeforce.OrderSubmit.TwoHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NextRound {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]), res = 0;
		int[] arr = new int[n], rank = new int[n];
		Arrays.fill(rank, n);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = arr.length-1; i >= 0; i--) {
			for (int j = arr.length-1; j >= 0; j--) {
				if (i == j) continue;
				if (arr[j] > arr[i]) break;
				rank[i]--;
			}
		}
		for (int i = 0; i < rank.length; i++) {
			if (rank[i] <= k && arr[i] != 0) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
