package Acmicpc.As.S5.ThirtyThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RopeJump30457 {
	static final int limit = 1000;
	static int[] arr = new int[limit+1];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0;
		
		while(st.hasMoreTokens()) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			res += Math.min(arr[i], 2);
		}
		
		System.out.println(res);
		br.close();
	}
}
