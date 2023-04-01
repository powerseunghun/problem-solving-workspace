package Acmicpc.As.B2.SixThousandth.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BallonPlay6246 {
	static int[] arr = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int Q = Integer.parseInt(tmp.split(" ")[1]), res = 0;
		arr = new int[N];
		
		for (int i = 0, L = 0, K = 0; i < Q; i++) {
			tmp = br.readLine();
			L = Integer.parseInt(tmp.split(" ")[0]);
			K = Integer.parseInt(tmp.split(" ")[1]);
			
			
			for (int j = L-1; j < arr.length; j+= K) {
				if (arr[j] != 0) continue;
				arr[j] = 1;
			}
		}
		
		for (int el : arr) {
			if (el == 0) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
