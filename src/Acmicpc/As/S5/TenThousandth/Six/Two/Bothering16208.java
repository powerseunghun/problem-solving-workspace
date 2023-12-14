package Acmicpc.As.S5.TenThousandth.Six.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bothering16208 {
	static long[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long sum = 0, res = 0;
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new long[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			sum += arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			long t = arr[i];
			sum -= t;
			res += t * sum;
		}
		
		System.out.println(res);
		br.close();
	}
}
