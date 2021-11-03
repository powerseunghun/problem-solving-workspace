package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertionSort {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), phase = 0, tmp = 0, key = 0, idx = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		phase = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			idx = i;
			for (int j = i-1; j >= 0; j--) {
				if (arr[j] > key) {
					tmp = arr[j];
					arr[j] = key;
					arr[idx] = tmp;
					idx = j;
				}
			}
			if (phase == i) break;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); 
		}
	}
}
