package Acmicpc.As.B3.TenThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABCDкод19774 {
	static boolean func(String tmp) {
		int[] arr = new int[tmp.length()];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = tmp.charAt(i)-'0';
		}
		sum = (int)(Math.pow(arr[0]*10+arr[1], 2) + Math.pow(arr[2]*10+arr[3], 2));
		
		return sum % 7 == 1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		
		while (N-- > 0) {
			tmp = br.readLine();
			sb.append(func(tmp) ? "YES\n" : "NO\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
