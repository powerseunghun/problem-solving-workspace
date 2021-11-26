package Goorm.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Marathone {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N+1], rank = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i < rank.length; i++) {
			rank[i] = i;
		}
		
		for (int i = 2; i < arr.length; i++) {
			for (int j = 1; j < i; j++) {
				if (arr[j] < arr[i]) rank[i]--;
			}
		}
		
		for (int i = 1; i < rank.length; i++) {
			sb.append(rank[i]);
			if (i != rank.length-1) sb.append(" ");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
