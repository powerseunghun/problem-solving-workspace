package Acmicpc.As.B2.FourThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Knitting4107 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String tmp = null;
		int N = 0, M = 0, K = 0, res = 0, idx = 0, val = 0;
		
		while (true) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			K = Integer.parseInt(tmp.split(" ")[2]);
			if (N == 0 && M == 0 && K == 0) break;
			
			idx = 0; res = 0; val = N;
			arr = new int[K];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for (int i = 0; i < M; i++) {
				res += val;
				val += arr[idx++];
				idx = idx >= arr.length ? 0 : idx;
			}
			
			sb.append(res + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
