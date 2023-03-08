package Acmicpc.As.B2.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceGame5566 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), j = 0, res = 0, cur = 0;
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < M; i++) {
			res++;
			j = Integer.parseInt(br.readLine());
			cur += j;
			if (cur >= N-1) break;
			cur += arr[cur];
			if (cur >= N-1) break;
		}
		
		System.out.println(res);
		br.close();
	}
}
