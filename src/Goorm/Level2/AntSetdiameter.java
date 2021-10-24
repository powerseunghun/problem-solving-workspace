package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AntSetdiameter {
	static int[] arr = null;
	static int min = Integer.MAX_VALUE;
	static void search(int l, int r, int count, int d) {
		if (l >= r) return;
//		System.out.println("arr[l] : " + arr[l]);
//		System.out.println("arr[r] : " + arr[r]);
		if (arr[r] - arr[l] <= d) {
			min = Math.min(min, count);
			return;
		}
		
		search(l, r-1, count+1, d);
		search(l+1, r, count+1, d);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 1 <= n <= 100,000, 0 <= d < 1,000,000
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int d = Integer.parseInt(tmp.split(" ")[1]);
		
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		search(0, arr.length-1, 0, d);
		System.out.println(min);
	}
}
