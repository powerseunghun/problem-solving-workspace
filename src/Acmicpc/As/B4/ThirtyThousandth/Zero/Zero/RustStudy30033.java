package Acmicpc.As.B4.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RustStudy30033 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		br.readLine();
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		while (st1.hasMoreTokens() && st2.hasMoreTokens()) {
			res = Integer.parseInt(st1.nextToken()) <= Integer.parseInt(st2.nextToken()) ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
