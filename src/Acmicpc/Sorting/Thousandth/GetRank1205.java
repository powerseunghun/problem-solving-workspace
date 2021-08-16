package Acmicpc.Sorting.Thousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class GetRank1205 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int S = Integer.parseInt(tmp.split(" ")[1]);
		int P = Integer.parseInt(tmp.split(" ")[2]), rank = 1;
		if (N == 0) {
			System.out.println("1");
			return;
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		if (N == P && S <= arr[arr.length-1]) {
			System.out.println("-1");
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > S) rank++;
			else break;
		}
		System.out.println(rank);
	}
}
