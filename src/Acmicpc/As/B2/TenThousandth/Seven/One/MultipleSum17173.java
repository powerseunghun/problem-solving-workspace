package Acmicpc.As.B2.TenThousandth.Seven.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultipleSum17173 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), res = 0;
		
		arr = new int[M];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i % arr[j] == 0) {
					res += i;
					break;
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
