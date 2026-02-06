package Acmicpc.As.B2.TenThousandth.Eight.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MountainRanges18041 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.split(" ")[0]);
		int X = Integer.parseInt(str.split(" ")[1]), res = 0, cnt = 1;
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i < N; i++) {
			if (arr[i]-arr[i-1] <= X) cnt++;
			else cnt = 1;
			res = Math.max(res, cnt);
		}
		
		System.out.println(N == 1 ? 1 : res);
		br.close();
	}
}
