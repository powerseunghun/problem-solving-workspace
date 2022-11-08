package Acmicpc.As.B3.TwentyThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MedalRanking25933 {
	static int[] arr = new int[6];
	static boolean check1() {
		int idx = 0;
		for (int i = 0; i < arr.length/2; i++) {
			if (arr[i] != arr[i+3]) {
				idx = i;
				break;
			}
		}
		return arr[idx] > arr[idx+3];
	}
	static boolean check2() {
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length/2) sum1 += arr[i];
			else sum2 += arr[i];
		}
		return sum1 > sum2;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), val = 0;
		boolean flag1 = false, flag2 = false;
		StringTokenizer st = null;
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			flag1 = check1();
			flag2 = check2();
			
			sb.append((flag1&&flag2) ? "both" : flag1 ? "color" : flag2 ? "count" : "none");
			if (T == 0) break;
			sb.append("\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
