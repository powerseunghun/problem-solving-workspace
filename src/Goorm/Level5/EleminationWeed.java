package Goorm.Level5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EleminationWeed {
	static void reCalc(int[] arr, int n, int a, int b) {
		for (int i = a; i < arr.length; i++) {
			arr[i] += (n == 2 ? b : b*-1);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int Q = Integer.parseInt(tmp.split(" ")[1]);
		int[] arr = new int[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr[i] += arr[i-1];
		}
		
		for (int i = 0, n = 0, a = 0, b = 0; i < Q; i++) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			a = Integer.parseInt(tmp.split(" ")[1]);
			b = Integer.parseInt(tmp.split(" ")[2]);
			if (n == 1) {
				sb.append(arr[b]-arr[a-1] + "\n");
				continue;
			}
			reCalc(arr, n, a, b);
		}
		System.out.print(sb.toString());
		br.close();
	}
}
