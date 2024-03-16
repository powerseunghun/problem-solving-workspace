package Acmicpc.As.B4.ThirtyThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parsing31403 {
	static final int len = 3;
	static String[] strs = new String[len];
	static int[] arr = new int[len];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		for (int i = 0; i < len; i++) {
			str = br.readLine();
			strs[i] = str;
			arr[i] = Integer.parseInt(str);
		}
		
		System.out.println(arr[0]+arr[1]-arr[2]);
		System.out.println(Integer.parseInt(strs[0]+strs[1])-arr[2]);
		br.close();
	}
}
