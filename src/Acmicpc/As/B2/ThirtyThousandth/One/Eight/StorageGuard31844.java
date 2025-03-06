package Acmicpc.As.B2.ThirtyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StorageGuard31844 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = str.indexOf('@');
		int b = str.indexOf('#');
		int c = str.indexOf('!');
		
		System.out.println((a<b && b<c) || (c<b && b<a) ? Math.abs(a-c)-1 : -1);
		br.close();
	}
}
