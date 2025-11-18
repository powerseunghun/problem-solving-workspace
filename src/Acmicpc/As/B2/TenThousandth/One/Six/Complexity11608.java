package Acmicpc.As.B2.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Complexity11608 {
	static final int l = 26;
	static int[] arr = new int[l];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = 0;
		
		for (char c : str.toCharArray()) {
			arr[c-'a']++;
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < l-2; i++) {
			res += arr[i];
		}
		
		System.out.println(res);
		br.close();
	}
}
