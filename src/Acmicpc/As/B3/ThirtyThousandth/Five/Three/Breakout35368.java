package Acmicpc.As.B3.ThirtyThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Breakout35368 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int x = Integer.parseInt(str.split(" ")[1])-1;
		int m = Integer.parseInt(str.split(" ")[2]), r1 = 0, r2 = 0;
		arr = new int[n];
		
		while(m-- > 0) {
			arr[Integer.parseInt(br.readLine())-1]++;
		}
		for (int i = 0; i < x; i++) {
			r1 += arr[i];
		}
		for (int i = n-1; i >= x; i--) {
			r2 += arr[i];
		}
		
		System.out.println(Math.min(r1, r2));
		br.close();
	}
}