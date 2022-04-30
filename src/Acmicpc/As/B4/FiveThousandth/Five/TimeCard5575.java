package Acmicpc.As.B4.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TimeCard5575 {
	static int[] arr = new int[6];
	static void calc() {
		for (int i = 0, idx = 5; i < 3; i++, idx--) {
			arr[idx] -= arr[idx-3];
			if (arr[idx] < 0) {
				arr[idx-1] -= 1;
				arr[idx] += 60;
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			calc();
			sb.append(arr[3] + " " + arr[4] + " " + arr[5] + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
