package Acmicpc.OrderSubmit.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ModularSum10986 {
	static int[] arr = null;
	static long getCount(int n) {
		return (long)n * (n-1) / 2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(tmp.split(" ")[1]), sum = 0, val = 0;
		long res = 0;
		
		arr = new int[M];
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			sum += val;
			arr[sum %= M]++;
		}
		res = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			res += getCount(arr[i]);
		}
		
		System.out.println(res);
		br.close();
	}
}
