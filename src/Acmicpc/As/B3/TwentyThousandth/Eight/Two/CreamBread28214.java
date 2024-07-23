package Acmicpc.As.B3.TwentyThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CreamBread28214 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]);
		int P = Integer.parseInt(str.split(" ")[2]);
		int res = Integer.parseInt(str.split(" ")[0]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N*K];
		
		for (int i = 0; i < N*K; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0, v = 0; i < N; i++, v = 0) {
			for (int j = 0; j < K; j++) {
				v = arr[i*K+j] == 0 ? v+1 : v;
			}
			if (v >= P) res--;
		}
		System.out.println(res);
		br.close();
	}
}
