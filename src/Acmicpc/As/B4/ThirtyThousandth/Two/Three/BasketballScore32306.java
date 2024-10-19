package Acmicpc.As.B4.ThirtyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasketballScore32306 {
	static final int l = 2;
	static final int[] res = new int[l];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for (int i = 0; i < res.length; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 1; st.hasMoreTokens(); j++) {
				res[i] += Integer.parseInt(st.nextToken()) * j;
			}
		}
		
		System.out.println(res[0] > res[1] ? "1" : res[0] < res[1] ? "2" : "0");
		br.close();
	}
}
