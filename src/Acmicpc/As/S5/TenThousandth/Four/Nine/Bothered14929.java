package Acmicpc.As.S5.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bothered14929 {
	static int[] arr = null, sumArr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		long res = 0;
		
		arr = new int[N+1];
		sumArr = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			v = Integer.parseInt(st.nextToken());
			arr[i] = v;
			sumArr[i] = sumArr[i-1]+v;
		}
		
		for (int i = 1; i < N; i++) {
			res += (sumArr[N] - sumArr[i]) * arr[i];
		}
		
		System.out.println(res);
		br.close();
	}
}
