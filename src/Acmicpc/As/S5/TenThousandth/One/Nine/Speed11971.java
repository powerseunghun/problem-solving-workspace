package Acmicpc.As.S5.TenThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Speed11971 {
	static final int limit = 100;
	static int[] arr1 = new int[limit+1], arr2 = new int[limit+1];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), a = 0, b = 0, res = 0;
		
		for (int i = 0, idx = 0; i < N; i++, idx+=a) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			for (int j = idx; j < idx+a; j++) {
				arr1[j] = b;
			}
		}
		for (int i = 0, idx = 0; i < M; i++, idx+=a) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			for (int j = idx; j < idx+a; j++) {
				arr2[j] = b;
			}
		}
		
		for (int i = 0; i <= limit; i++) {
			res = Math.max(res, arr2[i]-arr1[i]);
		}
		
		System.out.println(res);
		br.close();
	}
}
