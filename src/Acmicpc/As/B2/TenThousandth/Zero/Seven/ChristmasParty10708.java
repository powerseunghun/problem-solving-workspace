package Acmicpc.As.B2.TenThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChristmasParty10708 {
	static int[] scores = null, arr = null;;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), M = Integer.parseInt(br.readLine());
		int v = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		scores = new int[N+1];
		arr = new int[M];
		
		for (int i = 0; i < M; i++) {
			v = Integer.parseInt(st.nextToken());
			arr[i] = v;
		}
		for (int i = 0, t = 0; i < arr.length; i++, t = 0) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				v = Integer.parseInt(st.nextToken());
				if (v == arr[i]) {
					scores[j+1]++;
				}
				else t++;
			}
			scores[arr[i]] += t;
		}
		
		for (int i = 1; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		br.close();
	}
}
