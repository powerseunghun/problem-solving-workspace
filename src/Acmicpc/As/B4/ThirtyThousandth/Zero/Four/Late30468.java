package Acmicpc.As.B4.ThirtyThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Late30468 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0, v = 0;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			res += v;
		}
		
		res = v * 4 - (res-v);
		System.out.println(res < 0 ? 0 : res);
		br.close();
	}
}
