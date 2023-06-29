package Acmicpc.As.B2.TwentyThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConvenienceStore20155 {
	static int[] res = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(str.split(" ")[1]);
		int m = Integer.MIN_VALUE;
		
		res = new int[M+1];
		
		while (st.hasMoreTokens()) {
			m = Math.max(m, ++res[Integer.parseInt(st.nextToken())]);
		}
		
		System.out.println(m);
		br.close();
	}
}
