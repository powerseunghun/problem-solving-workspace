package Acmicpc.As.B3.TenThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Рекламаназаборе19796 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int M = Integer.parseInt(str.split(" ")[0]);
		int N = Integer.parseInt(str.split(" ")[1]), l = 0, r = 0;
		boolean flag = true;
		arr = new int[M];
		
		while(N-- > 0) {
			str = br.readLine();
			l = Integer.parseInt(str.split(" ")[0]);
			r = Integer.parseInt(str.split(" ")[1]);
			for (int i = l-1; i < r; i++) {
				arr[i] = 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "YES" : "NO");
		br.close();
	}
}
