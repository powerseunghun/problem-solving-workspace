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
		if (l < 0 || r < 0 || l > arr.length-1 || r > arr.length-1) return;
		if (l >= r) return;
		if (arr[r] - arr[l] <= d) {
			min = Math.min(min, count);
			return;
		}
		int size = l+r;
		
		search(l, r-size/2, count+size/2, d);
		search(l+size/2, r, count+size/2, d);
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
