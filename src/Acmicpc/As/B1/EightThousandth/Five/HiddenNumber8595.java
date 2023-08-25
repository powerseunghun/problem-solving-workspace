package Acmicpc.As.B1.EightThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HiddenNumber8595 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = null;
		br.readLine();
		String str = br.readLine().replaceAll("[^0-9]", " ");
		StringTokenizer st = new StringTokenizer(str, " ");
		long res = 0;
		
		while (st.hasMoreTokens()) {
			res += Long.parseLong(st.nextToken());
		}
		
		System.out.println(res);
		br.close();
	}
}
