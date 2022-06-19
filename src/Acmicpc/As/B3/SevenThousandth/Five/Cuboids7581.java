package Acmicpc.As.B3.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cuboids7581 {
	static int[] arr = new int[4];
	static void func() {
		int idx = 0, tmp = 0;
		if (arr[0] == 0 || arr[1] == 0 || arr[2] == 0) {
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i] == 0) {
					idx = i;
					break;
				}
			}
			tmp = arr[arr.length-1];
			for (int i = 0; i < arr.length-1; i++) {
				if (i == idx) continue;
				tmp /= arr[i];
			}
			arr[idx] = tmp;
		}
		else arr[3] = arr[0] * arr[1] * arr[2];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0) break;
			func();
			
			for (int el : arr) {
				sb.append(el + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
