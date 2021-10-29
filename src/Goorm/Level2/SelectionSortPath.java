package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectionSortPath {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int s = Integer.parseInt(tmp.split(" ")[1]), min = 0, minIdx = 0;
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0, val = 0; i < n; i++) {
			min = arr[i];
			minIdx = i;
			for (int j = i+1; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIdx = j;
				}
			}
			val = arr[i];
			arr[i] = min;
			arr[minIdx] = val;
			if (i+1 == s) break;
		}
		for (int el : arr) {
			System.out.print(el + " ");
		}
	}
}
