package Acmicpc.As.B3.ThirtyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmptyLecture34703 {
	static final int l = 6;
	static int[] arr = new int[l];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean flag = false;
		
		while(N-- > 0) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0) {
				flag = true;
			}
		}
		System.out.println(flag ? "YES" : "NO");
		br.close();
	}
}
