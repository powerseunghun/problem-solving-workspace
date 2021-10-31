package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Fisherman {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), p1 = 0, p2 = 0, count = 0;
		int target = Integer.parseInt(tmp.split(" ")[1]);
		long val = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long[] arr = new long[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i != 0) arr[i] += arr[i-1];
		}
		
		while (p2 <= N) {
			val = arr[p2]-arr[p1];
			if (val >= target) {
				if (val == target) {
					count++;
				}
				p1++;
			}
			else p2++;
		}
		System.out.println(count);
	}
}
