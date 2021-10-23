package Goorm.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlienMoneyPaper {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int s = Integer.parseInt(tmp.split(" ")[1]);
		long val = 0;
		long[] arr = new long[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			if (i > 1) arr[i] += arr[i-1];
		}
		
		for (int i = 0, a = 0, b = 0; i < s; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			val = arr[b] - arr[a-1];
			sb.append((val >= 0 ? ("+" + val) : val) + " \n");
		}
		System.out.print(sb.toString());
	}
}
