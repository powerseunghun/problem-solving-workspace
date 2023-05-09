package Acmicpc.As.B2.TenThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BorrowBook16497 {
	static final int dayEnd = 32;
	static int[] arr = null;
	static boolean check(int K) {
		for (int i = 1; i < dayEnd; i++) {
			if (arr[i] > K) return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), K = 0, s = 0, e = 0;
		String tmp = null;
		
		arr = new int[dayEnd];
		while(T-- > 0) {
			tmp = br.readLine();
			s = Integer.parseInt(tmp.split(" ")[0]);
			e = Integer.parseInt(tmp.split(" ")[1]);
			
			for (int i = s; i < e; i++) {
				arr[i]++;
			}
		}
		K = Integer.parseInt(br.readLine());
		
		System.out.println(check(K) ? "1" : "0");
		br.close();
	}
}
