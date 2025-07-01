package Acmicpc.As.B2.ThirtyThousandth.Two.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Late32280 {
	static int[] arr = null;
	static int getTime(String str) {
		return (Integer.parseInt(str.split(":")[0]) * 60) + Integer.parseInt(str.split(":")[1]);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), t = 0, l = 0, res = 0;
		arr = new int[N];
		String str = null;
		
		for (int i = 0, v = 0, idx = 0; i < arr.length+1; i++) {
			str = br.readLine();
			v = getTime(str.split(" ")[0]);
			if (str.contains("teacher")) {
				t = v;
				continue;
			}
			arr[idx++] = v;
		}
		str = br.readLine();
		l = getTime(str);
		
		for (int el : arr) {
			if (el >= l && el >= t) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
