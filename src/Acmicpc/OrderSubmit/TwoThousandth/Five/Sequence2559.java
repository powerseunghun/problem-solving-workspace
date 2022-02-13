package Acmicpc.OrderSubmit.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sequence2559 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), max = Integer.MIN_VALUE;
		int[] arr = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr[i] += arr[i-1];
		}
		
		for (int i = K; i < arr.length; i++) {
			max = Math.max(max, arr[i]-arr[i-K]);
		}
		
		System.out.println(max);
		br.close();
	}
}
