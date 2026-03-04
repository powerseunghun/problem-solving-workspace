package Acmicpc.As.B2.TwentyThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AgeDifference27335 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, v = 0;;
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		for (int el : arr) {
			sb.append(Math.max(el-min, max-el)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
