package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShakeSort {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().replaceAll(" ", "")), l = 0, r = N-1, lastSwap = 0, step = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1, tmp = 0; l < r; i++) {
			step++;
			if (i % 2 == 0) {
				for (int j = l; j < r; j++) {
					if (arr[j+1] < arr[j]) {
						tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
						lastSwap = j;
					}
				}
				r = lastSwap;
			}
			else {
				for (int j = r; j > l; j--) {
					if (arr[j-1] > arr[j]) {
						tmp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = tmp;
						lastSwap = j;
					}
				}
				l = lastSwap;
			}
		}
		System.out.println(step % 2 != 0 ? step/2 + 1 : step/2);
	}
}
