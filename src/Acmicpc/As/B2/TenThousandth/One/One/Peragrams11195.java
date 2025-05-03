package Acmicpc.As.B2.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Peragrams11195 {
	static int[] arr = new int[26];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)-'a']++;
		}
		for (int el : arr) {
			if ((el & 1) != 0) res++;
		}
		
		System.out.println(Math.max(0, res-1));
		br.close();
	}
}
