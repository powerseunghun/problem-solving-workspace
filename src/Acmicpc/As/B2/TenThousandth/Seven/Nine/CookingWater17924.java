package Acmicpc.As.B2.TenThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookingWater17924 {
	static final int l = 1001;
	static int[] arr = new int[l];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String str = null;
		boolean flag = false;
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			
			for (int j = a; j <= b; j++) {
				arr[j]++;
			}
		}
		
		for (int i = 0; i < l; i++) {
			if (arr[i] == N) flag = true;
		}
		
		System.out.println(flag ? "gunilla has a point" : "edward is right");
		br.close();
	}
}
