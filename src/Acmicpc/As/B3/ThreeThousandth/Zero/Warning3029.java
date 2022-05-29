package Acmicpc.As.B3.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Warning3029 {
	static int[] arr1 = new int[3];
	static int[] arr2 = new int[3];
	static int[] res = new int[3];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine(), ":");
			if (i == 0) {
				arr1[0] = Integer.parseInt(st.nextToken());
				arr1[1] = Integer.parseInt(st.nextToken());
				arr1[2] = Integer.parseInt(st.nextToken());
			}
			else {
				arr2[0] = Integer.parseInt(st.nextToken());
				arr2[1] = Integer.parseInt(st.nextToken());
				arr2[2] = Integer.parseInt(st.nextToken());
			}
		}
		if (arr1[0] == arr2[0] && arr1[1] == arr2[1] && arr1[2] == arr2[2]) {
			res[0] = 24;
			res[1] = 0;
			res[2] = 0;
			flag = false;
		}
		
		if (flag) {
			for (int i = 2; i >= 1; i--) {
				if (arr1[i] > arr2[i]) {
					arr2[i] += 60;
					arr2[i-1]--;
				}
			}
			if (arr1[0] > arr2[0]) arr2[0] += 24;
			for (int i = 0; i < arr1.length; i++) {
				res[i] = arr2[i]-arr1[i];
			}
			
			if (res[0] == 0 && res[1] == 0 && res[2] == 0) {
				res[2] = 1;
			}
			if (res[0] == 24 && res[1] >= 0 && res[2] >= 0) {
				res[1] = 0;
				res[2] = 0;
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			sb.append(String.format("%02d", res[i]));
			if(i == res.length-1) continue;
			sb.append(":");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
