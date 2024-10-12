package Acmicpc.As.B3.ThirtyThousandth.Two.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColdWaterShower32216 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int k = Integer.parseInt(str.split(" ")[1]);
		int T = Integer.parseInt(str.split(" ")[2]), res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0, v = 0; i < arr.length; i++) {
			if (T > k) {
				v = T + arr[i] - Math.abs(T-k);
			} else if (T < k) {
				v = T + arr[i] + Math.abs(T-k);
			} else {
				v = T + arr[i];
			}
			res += Math.abs(v-k);
			T=v;
		}
		
		System.out.println(res);
		br.close();
	}
}
